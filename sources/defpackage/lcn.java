package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcn extends gdb implements lco {
    public final lfv a;
    private Boolean b;
    private String c;

    public lcn(lfv lfvVar) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        kro.l(lfvVar);
        this.a = lfvVar;
        this.c = null;
    }

    private final void B(lbg lbgVar) {
        kro.l(lbgVar);
        String str = lbgVar.a;
        kro.i(str);
        f(str, false);
        this.a.r().ac(lbgVar.b);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[Catch: SecurityException -> 0x00d2, TryCatch #0 {SecurityException -> 0x00d2, blocks: (B:6:0x000c, B:8:0x0010, B:10:0x0018, B:12:0x0028, B:14:0x002e, B:15:0x0032, B:17:0x0038, B:19:0x003e, B:21:0x0044, B:23:0x004e, B:24:0x0055, B:26:0x0071, B:30:0x0078, B:32:0x0082, B:35:0x008e, B:39:0x0095, B:33:0x0085, B:34:0x0089, B:40:0x009b, B:42:0x00a1, B:44:0x00a5, B:46:0x00b7, B:47:0x00b9, B:50:0x00c2, B:51:0x00d1), top: B:58:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[Catch: SecurityException -> 0x00d2, TryCatch #0 {SecurityException -> 0x00d2, blocks: (B:6:0x000c, B:8:0x0010, B:10:0x0018, B:12:0x0028, B:14:0x002e, B:15:0x0032, B:17:0x0038, B:19:0x003e, B:21:0x0044, B:23:0x004e, B:24:0x0055, B:26:0x0071, B:30:0x0078, B:32:0x0082, B:35:0x008e, B:39:0x0095, B:33:0x0085, B:34:0x0089, B:40:0x009b, B:42:0x00a1, B:44:0x00a5, B:46:0x00b7, B:47:0x00b9, B:50:0x00c2, B:51:0x00d1), top: B:58:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0089 A[Catch: SecurityException -> 0x00d2, TryCatch #0 {SecurityException -> 0x00d2, blocks: (B:6:0x000c, B:8:0x0010, B:10:0x0018, B:12:0x0028, B:14:0x002e, B:15:0x0032, B:17:0x0038, B:19:0x003e, B:21:0x0044, B:23:0x004e, B:24:0x0055, B:26:0x0071, B:30:0x0078, B:32:0x0082, B:35:0x008e, B:39:0x0095, B:33:0x0085, B:34:0x0089, B:40:0x009b, B:42:0x00a1, B:44:0x00a5, B:46:0x00b7, B:47:0x00b9, B:50:0x00c2, B:51:0x00d1), top: B:58:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    private final void f(String str, boolean z) {
        boolean z2;
        String[] packagesForUid;
        kmi kmiVar;
        int length;
        if (TextUtils.isEmpty(str)) {
            this.a.aT().c.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                Boolean boolValueOf = this.b;
                if (boolValueOf == null) {
                    if ("com.google.android.gms".equals(this.c)) {
                        z2 = true;
                    } else {
                        Context contextAS = this.a.aS();
                        if (lqd.l(contextAS, Binder.getCallingUid(), "com.google.android.gms")) {
                            try {
                                PackageInfo packageInfo = contextAS.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                kmm kmmVarA = kmm.a(contextAS);
                                if (packageInfo == null) {
                                    kmm kmmVarA2 = kmm.a(this.a.aS());
                                    packagesForUid = ((Context) kmmVarA2.a).getPackageManager().getPackagesForUid(Binder.getCallingUid());
                                    if (packagesForUid == null && (length = packagesForUid.length) != 0) {
                                        kmiVar = null;
                                        int i = 0;
                                        while (true) {
                                            if (i >= length) {
                                                kro.l(kmiVar);
                                                break;
                                            }
                                            kmiVar = kmmVarA2.d(packagesForUid[i]);
                                            if (kmiVar.b) {
                                                break;
                                            } else {
                                                i++;
                                            }
                                        }
                                    } else {
                                        kmiVar = new kmi(false);
                                    }
                                    if (kmiVar.b) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    if (!kmm.c(packageInfo, false)) {
                                        if (!kmm.c(packageInfo, true)) {
                                            kmm kmmVarA3 = kmm.a(this.a.aS());
                                            packagesForUid = ((Context) kmmVarA3.a).getPackageManager().getPackagesForUid(Binder.getCallingUid());
                                            if (packagesForUid == null) {
                                                kmiVar = new kmi(false);
                                            } else {
                                                kmiVar = new kmi(false);
                                            }
                                            if (kmiVar.b) {
                                                z2 = false;
                                            }
                                        } else if (!kml.e((Context) kmmVarA.a)) {
                                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                            kmm kmmVarA4 = kmm.a(this.a.aS());
                                            packagesForUid = ((Context) kmmVarA4.a).getPackageManager().getPackagesForUid(Binder.getCallingUid());
                                            if (packagesForUid == null) {
                                                kmiVar = new kmi(false);
                                            } else {
                                                kmiVar = new kmi(false);
                                            }
                                            if (kmiVar.b) {
                                                z2 = false;
                                            }
                                        }
                                    }
                                    z2 = true;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        } else {
                            kmm kmmVarA5 = kmm.a(this.a.aS());
                            packagesForUid = ((Context) kmmVarA5.a).getPackageManager().getPackagesForUid(Binder.getCallingUid());
                            if (packagesForUid == null) {
                                kmiVar = new kmi(false);
                            } else {
                                kmiVar = new kmi(false);
                            }
                            if (kmiVar.b) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z2);
                    this.b = boolValueOf;
                }
                if (boolValueOf.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.a.aT().c.b("Measurement Service called with invalid calling package. appId", lcz.a(str));
                throw e;
            }
        }
        if (this.c == null) {
            Context contextAS2 = this.a.aS();
            int callingUid = Binder.getCallingUid();
            boolean z3 = kml.a;
            if (lqd.l(contextAS2, callingUid, str)) {
                this.c = str;
            }
        }
        if (str.equals(this.c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // defpackage.lco
    public final byte[] A(lcd lcdVar, String str) {
        kro.i(str);
        kro.l(lcdVar);
        f(str, true);
        lfv lfvVar = this.a;
        lcx lcxVar = lfvVar.aT().j;
        lcu lcuVarK = lfvVar.k();
        String str2 = lcdVar.a;
        lcxVar.b("Log and bundle. event", lcuVarK.c(str2));
        lfvVar.aV();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) lfvVar.aU().d(new ldx(this, lcdVar, str)).get();
            if (bArr == null) {
                lfvVar.aT().c.b("Log and bundle returned null. appId", lcz.a(str));
                bArr = new byte[0];
            }
            lfvVar.aV();
            lfvVar.aT().j.d("Log and bundle processed. event, size, time_ms", lfvVar.k().c(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            lfv lfvVar2 = this.a;
            lfvVar2.aT().c.d("Failed to log and bundle. appId, event, error", lcz.a(str), lfvVar2.k().c(lcdVar.a), e);
            return null;
        }
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList = null;
        lcp lcpVar = null;
        lcs lcqVar = null;
        switch (i) {
            case 1:
                lcd lcdVar = (lcd) gdc.a(parcel, lcd.CREATOR);
                lbg lbgVar = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                o(lcdVar, lbgVar);
                parcel2.writeNoException();
                break;
            case 2:
                lfy lfyVar = (lfy) gdc.a(parcel, lfy.CREATOR);
                lbg lbgVar2 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                y(lfyVar, lbgVar2);
                parcel2.writeNoException();
                break;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                lbg lbgVar3 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                m(lbgVar3);
                parcel2.writeNoException();
                break;
            case 5:
                lcd lcdVar2 = (lcd) gdc.a(parcel, lcd.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                gdc.b(parcel);
                kro.l(lcdVar2);
                kro.i(string);
                f(string, true);
                e(new gwb((Object) this, (Object) lcdVar2, string, 19));
                parcel2.writeNoException();
                break;
            case 6:
                lbg lbgVar4 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                w(lbgVar4);
                parcel2.writeNoException();
                break;
            case 7:
                lbg lbgVar5 = (lbg) gdc.a(parcel, lbg.CREATOR);
                boolean zF = gdc.f(parcel);
                gdc.b(parcel);
                B(lbgVar5);
                String str = lbgVar5.a;
                kro.l(str);
                try {
                    List<aaqp> list = (List) this.a.aU().c(new ldy(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (aaqp aaqpVar : list) {
                        if (zF || !lga.am((String) aaqpVar.d)) {
                            arrayList2.add(new lfy(aaqpVar));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException | ExecutionException e) {
                    this.a.aT().c.c("Failed to get user properties. appId", lcz.a(lbgVar5.a), e);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                break;
            case 9:
                lcd lcdVar3 = (lcd) gdc.a(parcel, lcd.CREATOR);
                String string2 = parcel.readString();
                gdc.b(parcel);
                byte[] bArrA = A(lcdVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrA);
                break;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                gdc.b(parcel);
                t(j, string3, string4, string5);
                parcel2.writeNoException();
                break;
            case 11:
                lbg lbgVar6 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                String strB = b(lbgVar6);
                parcel2.writeNoException();
                parcel2.writeString(strB);
                break;
            case 12:
                lbq lbqVar = (lbq) gdc.a(parcel, lbq.CREATOR);
                lbg lbgVar7 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                r(lbqVar, lbgVar7);
                parcel2.writeNoException();
                break;
            case 13:
                lbq lbqVar2 = (lbq) gdc.a(parcel, lbq.CREATOR);
                gdc.b(parcel);
                kro.l(lbqVar2);
                kro.l(lbqVar2.c);
                kro.i(lbqVar2.a);
                f(lbqVar2.a, true);
                e(new ldu(this, new lbq(lbqVar2), 3));
                parcel2.writeNoException();
                break;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                boolean zF2 = gdc.f(parcel);
                lbg lbgVar8 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                List listI = i(string6, string7, zF2, lbgVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listI);
                break;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean zF3 = gdc.f(parcel);
                gdc.b(parcel);
                List listJ = j(string8, string9, string10, zF3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ);
                break;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                lbg lbgVar9 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                List listG = g(string11, string12, lbgVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listG);
                break;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                gdc.b(parcel);
                List listH = h(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listH);
                break;
            case 18:
                lbg lbgVar10 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                q(lbgVar10);
                parcel2.writeNoException();
                break;
            case 19:
                Bundle bundle = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                lbg lbgVar11 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                u(bundle, lbgVar11);
                parcel2.writeNoException();
                break;
            case 20:
                lbg lbgVar12 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                s(lbgVar12);
                parcel2.writeNoException();
                break;
            case 21:
                lbg lbgVar13 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                lbu lbuVarA = a(lbgVar13);
                parcel2.writeNoException();
                gdc.d(parcel2, lbuVarA);
                break;
            case 24:
                lbg lbgVar14 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                B(lbgVar14);
                kro.l(lbgVar14.a);
                List list2 = Collections.EMPTY_LIST;
                parcel2.writeNoException();
                parcel2.writeTypedList(list2);
                break;
            case 25:
                lbg lbgVar15 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                x(lbgVar15);
                parcel2.writeNoException();
                break;
            case 26:
                lbg lbgVar16 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                v(lbgVar16);
                parcel2.writeNoException();
                break;
            case 27:
                lbg lbgVar17 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                k(lbgVar17);
                parcel2.writeNoException();
                break;
            case 29:
                lbg lbgVar18 = (lbg) gdc.a(parcel, lbg.CREATOR);
                lfm lfmVar = (lfm) gdc.a(parcel, lfm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    lcqVar = iInterfaceQueryLocalInterface instanceof lcs ? (lcs) iInterfaceQueryLocalInterface : new lcq(strongBinder);
                }
                gdc.b(parcel);
                n(lbgVar18, lfmVar, lcqVar);
                parcel2.writeNoException();
                break;
            case 30:
                lbg lbgVar19 = (lbg) gdc.a(parcel, lbg.CREATOR);
                lbp lbpVar = (lbp) gdc.a(parcel, lbp.CREATOR);
                gdc.b(parcel);
                z(lbgVar19, lbpVar);
                parcel2.writeNoException();
                break;
            case 31:
                lbg lbgVar20 = (lbg) gdc.a(parcel, lbg.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    lcpVar = iInterfaceQueryLocalInterface2 instanceof lcp ? (lcp) iInterfaceQueryLocalInterface2 : new lcp(strongBinder2);
                }
                gdc.b(parcel);
                B(lbgVar20);
                String str2 = lbgVar20.a;
                kro.l(str2);
                this.a.aU().j(new gwb((Object) this, (Object) lcpVar, (Object) str2, 16, (byte[]) null));
                parcel2.writeNoException();
                break;
            case 32:
                lbg lbgVar21 = (lbg) gdc.a(parcel, lbg.CREATOR);
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(lbx.CREATOR);
                gdc.b(parcel);
                p(lbgVar21, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                break;
            case 33:
                lbg lbgVar22 = (lbg) gdc.a(parcel, lbg.CREATOR);
                gdc.b(parcel);
                l(lbgVar22);
                parcel2.writeNoException();
                break;
        }
        return true;
    }

    @Override // defpackage.lco
    public final lbu a(lbg lbgVar) {
        B(lbgVar);
        kro.i(lbgVar.a);
        try {
            return (lbu) this.a.aU().d(new ldy(this, lbgVar, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.a.aT().c.c("Failed to get consent. appId", lcz.a(lbgVar.a), e);
            return new lbu(null);
        }
    }

    @Override // defpackage.lco
    public final String b(lbg lbgVar) {
        B(lbgVar);
        return this.a.y(lbgVar);
    }

    public final void c(lcd lcdVar, lbg lbgVar) {
        lfv lfvVar = this.a;
        lfvVar.B();
        lfvVar.H(lcdVar, lbgVar);
    }

    public final void d(Runnable runnable) {
        lfv lfvVar = this.a;
        if (lfvVar.aU().l()) {
            runnable.run();
        } else {
            lfvVar.aU().k(runnable);
        }
    }

    public final void e(Runnable runnable) {
        lfv lfvVar = this.a;
        if (lfvVar.aU().l()) {
            runnable.run();
        } else {
            lfvVar.aU().j(runnable);
        }
    }

    @Override // defpackage.lco
    public final List g(String str, String str2, lbg lbgVar) {
        B(lbgVar);
        String str3 = lbgVar.a;
        kro.l(str3);
        try {
            return (List) this.a.aU().c(new ldv(this, str3, str, str2, 2, null)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.aT().c.b("Failed to get conditional user properties", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.lco
    public final List h(String str, String str2, String str3) {
        f(str, true);
        try {
            return (List) this.a.aU().c(new ldv(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.aT().c.b("Failed to get conditional user properties as", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.lco
    public final List i(String str, String str2, boolean z, lbg lbgVar) {
        B(lbgVar);
        String str3 = lbgVar.a;
        kro.l(str3);
        try {
            List<aaqp> list = (List) this.a.aU().c(new ldv(this, str3, str, str2, 1, null)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aaqp aaqpVar : list) {
                if (z || !lga.am((String) aaqpVar.d)) {
                    arrayList.add(new lfy(aaqpVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.aT().c.c("Failed to query user properties. appId", lcz.a(lbgVar.a), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.lco
    public final List j(String str, String str2, String str3, boolean z) {
        f(str, true);
        try {
            List<aaqp> list = (List) this.a.aU().c(new ldv(this, str, str2, str3, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aaqp aaqpVar : list) {
                if (z || !lga.am((String) aaqpVar.d)) {
                    arrayList.add(new lfy(aaqpVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.aT().c.c("Failed to get user properties as. appId", lcz.a(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.lco
    public final void k(lbg lbgVar) {
        B(lbgVar);
        e(new ldu(this, lbgVar, 0));
    }

    @Override // defpackage.lco
    public final void l(lbg lbgVar) {
        B(lbgVar);
        e(new ldu(this, lbgVar, 2));
    }

    @Override // defpackage.lco
    public final void m(lbg lbgVar) {
        B(lbgVar);
        e(new ldu(this, lbgVar, 7));
    }

    @Override // defpackage.lco
    public final void n(lbg lbgVar, final lfm lfmVar, final lcs lcsVar) {
        B(lbgVar);
        final String str = lbgVar.a;
        kro.l(str);
        this.a.aU().j(new Runnable() { // from class: ldt
            /* JADX WARN: Code duplicated, block: B:26:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:29:0x00d7 A[LOOP:2: B:27:0x00d1->B:29:0x00d7, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:34:0x011f A[Catch: aiik -> 0x0174, LOOP:3: B:32:0x0112->B:34:0x011f, LOOP_END, TryCatch #0 {aiik -> 0x0174, blocks: (B:31:0x0103, B:32:0x0112, B:34:0x011f, B:35:0x014a, B:37:0x0160), top: B:48:0x0103 }] */
            /* JADX WARN: Code duplicated, block: B:37:0x0160 A[Catch: aiik -> 0x0174, TRY_LEAVE, TryCatch #0 {aiik -> 0x0174, blocks: (B:31:0x0103, B:32:0x0112, B:34:0x011f, B:35:0x014a, B:37:0x0160), top: B:48:0x0103 }] */
            @Override // java.lang.Runnable
            public final void run() {
                Bundle bundle;
                lfl lflVar;
                aihf aihfVar;
                int i;
                lcn lcnVar = this.d;
                lfv lfvVar = lcnVar.a;
                lfvVar.B();
                lfvVar.A();
                lfvVar.D();
                lbt lbtVarI = lfvVar.i();
                String str2 = str;
                boolean zF = lbtVarI.F(str2, lcl.M);
                lcs lcsVar2 = lcsVar;
                Object obj = null;
                if (zF) {
                    lfvVar.aU().j(new lfa(lfvVar, str2, 8, (byte[]) null));
                }
                List<lfw> listAi = lfvVar.v().ai(str2, lfmVar, ((Integer) lcl.C.b(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (lfw lfwVar : listAi) {
                    String str3 = lfwVar.d;
                    if (lfvVar.ae(str2, str3)) {
                        int i2 = lfwVar.j;
                        if (i2 <= 0) {
                            bundle = new Bundle();
                            for (Map.Entry entry : lfwVar.e.entrySet()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            lflVar = new lfl(lfwVar.a, lfwVar.c.toByteArray(), str3, bundle, lfwVar.f.g, lfwVar.h, "");
                            try {
                                aihfVar = (aihf) lfx.l(liq.a.createBuilder(), lflVar.b);
                                for (i = 0; i < ((liq) aihfVar.instance).c.size(); i++) {
                                    aihf builder = ((lir) ((liq) aihfVar.instance).c.get(i)).toBuilder();
                                    lfvVar.aV();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    builder.copyOnWrite();
                                    lir lirVar = (lir) builder.instance;
                                    lirVar.b |= 2;
                                    lirVar.g = jCurrentTimeMillis;
                                    aihfVar.bj(i, builder);
                                }
                                lflVar.b = ((liq) aihfVar.build()).toByteArray();
                                if (lfvVar.aT().i(2)) {
                                    lflVar.g = lfvVar.q().m((liq) aihfVar.build());
                                }
                                arrayList.add(lflVar);
                            } catch (aiik unused) {
                                lfvVar.aT().f.b("Failed to parse queued batch. appId", str2);
                            }
                        } else {
                            int iIntValue = ((Integer) lcl.A.b(obj)).intValue();
                            if (iIntValue <= 0 || i2 <= iIntValue) {
                                long jLongValue = ((Long) lcl.y.b(obj)).longValue();
                                long jLongValue2 = ((Long) lcl.z.b(obj)).longValue();
                                int i3 = 1;
                                while (true) {
                                    if (i3 >= i2) {
                                        jLongValue2 = jLongValue;
                                        break;
                                    }
                                    jLongValue <<= 1;
                                    if (jLongValue >= jLongValue2 || jLongValue < 0) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                lfvVar.aV();
                                if (System.currentTimeMillis() >= lfwVar.i + jLongValue2) {
                                    bundle = new Bundle();
                                    while (r8.hasNext()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    lflVar = new lfl(lfwVar.a, lfwVar.c.toByteArray(), str3, bundle, lfwVar.f.g, lfwVar.h, "");
                                    aihfVar = (aihf) lfx.l(liq.a.createBuilder(), lflVar.b);
                                    while (i < ((liq) aihfVar.instance).c.size()) {
                                        aihf builder2 = ((lir) ((liq) aihfVar.instance).c.get(i)).toBuilder();
                                        lfvVar.aV();
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        builder2.copyOnWrite();
                                        lir lirVar2 = (lir) builder2.instance;
                                        lirVar2.b |= 2;
                                        lirVar2.g = jCurrentTimeMillis2;
                                        aihfVar.bj(i, builder2);
                                    }
                                    lflVar.b = ((liq) aihfVar.build()).toByteArray();
                                    if (lfvVar.aT().i(2)) {
                                        lflVar.g = lfvVar.q().m((liq) aihfVar.build());
                                    }
                                    arrayList.add(lflVar);
                                }
                            }
                            lfvVar.aT().k.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str2, Long.valueOf(lfwVar.a), Long.valueOf(lfwVar.i));
                        }
                        obj = null;
                    } else {
                        lfvVar.aT().k.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str2, Long.valueOf(lfwVar.a), lfwVar.d);
                    }
                }
                lfn lfnVar = new lfn(arrayList);
                try {
                    lcsVar2.a(lfnVar);
                    lcnVar.a.aT().k.c("[sgtm] Sending queued upload batches to client. appId, count", str2, Integer.valueOf(lfnVar.a.size()));
                } catch (RemoteException e) {
                    lcnVar.a.aT().c.c("[sgtm] Failed to return upload batches for app", str2, e);
                }
            }
        });
    }

    @Override // defpackage.lco
    public final void o(lcd lcdVar, lbg lbgVar) {
        kro.l(lcdVar);
        B(lbgVar);
        e(new ldw(this, lcdVar, lbgVar));
    }

    @Override // defpackage.lco
    public final void p(lbg lbgVar, List list) {
        B(lbgVar);
        e(new gwb(this, lbgVar, list, 17, (short[]) null));
    }

    @Override // defpackage.lco
    public final void q(lbg lbgVar) {
        String str = lbgVar.a;
        kro.i(str);
        f(str, false);
        e(new ldu(this, lbgVar, 4));
    }

    @Override // defpackage.lco
    public final void r(lbq lbqVar, lbg lbgVar) {
        kro.l(lbqVar);
        kro.l(lbqVar.c);
        B(lbgVar);
        lbq lbqVar2 = new lbq(lbqVar);
        lbqVar2.a = lbgVar.a;
        e(new gwb(this, lbqVar2, lbgVar, 18, (char[]) null));
    }

    @Override // defpackage.lco
    public final void s(lbg lbgVar) {
        kro.i(lbgVar.a);
        kro.l(lbgVar.s);
        d(new ldu(this, lbgVar, 6));
    }

    @Override // defpackage.lco
    public final void t(long j, String str, String str2, String str3) {
        e(new lel(this, str2, str3, str, j, 1));
    }

    @Override // defpackage.lco
    public final void u(Bundle bundle, lbg lbgVar) {
        B(lbgVar);
        String str = lbgVar.a;
        kro.l(str);
        e(new aew((Object) this, (Object) bundle, str, (Object) lbgVar, 14));
    }

    @Override // defpackage.lco
    public final void v(lbg lbgVar) {
        kro.i(lbgVar.a);
        kro.l(lbgVar.s);
        d(new ldu(this, lbgVar, 1, (byte[]) null));
    }

    @Override // defpackage.lco
    public final void w(lbg lbgVar) {
        B(lbgVar);
        e(new ldu(this, lbgVar, 5));
    }

    @Override // defpackage.lco
    public final void x(lbg lbgVar) {
        kro.i(lbgVar.a);
        kro.l(lbgVar.s);
        d(new jmi(this, lbgVar, 20, (char[]) null));
    }

    @Override // defpackage.lco
    public final void y(lfy lfyVar, lbg lbgVar) {
        kro.l(lfyVar);
        B(lbgVar);
        e(new gwb(this, lfyVar, lbgVar, 20));
    }

    @Override // defpackage.lco
    public final void z(final lbg lbgVar, final lbp lbpVar) {
        B(lbgVar);
        e(new Runnable() { // from class: lds
            /* JADX WARN: Code duplicated, block: B:69:0x021b  */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                Cursor cursor;
                Cursor cursor2;
                lfv lfvVar = this.c.a;
                lfvVar.B();
                String str = lbgVar.a;
                kro.l(str);
                lfvVar.A();
                lfvVar.D();
                lbp lbpVar2 = lbpVar;
                lgp lgpVarV = lfvVar.v();
                long j = lbpVar2.a;
                lgpVarV.o();
                lgpVarV.w();
                Cursor cursor3 = null;
                lfwVarK = null;
                lfwVarK = null;
                lfw lfwVarK = null;
                try {
                    Cursor cursorQuery = lgpVarV.e().query("upload_queue", new String[]{"rowid", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowid=?", new String[]{String.valueOf(j)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                try {
                                    String string = cursorQuery.getString(1);
                                    kro.l(string);
                                    try {
                                        cursor2 = cursorQuery;
                                        try {
                                            lfwVarK = lgpVarV.k(j, string, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (SQLiteException e) {
                                            e = e;
                                            cursor = cursor2;
                                            try {
                                                lgpVarV.aT().c.c("Error when querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j), e);
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor3 = cursor;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor3 = cursor2;
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursor2 = cursorQuery;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    cursor2 = cursorQuery;
                                }
                            } else if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            cursor2 = cursorQuery;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursorQuery;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    cursor = null;
                } catch (Throwable th4) {
                    th = th4;
                }
                lfw lfwVar = lfwVarK;
                if (lfwVar == null) {
                    lfvVar.aT().f.c("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(lbpVar2.a));
                    return;
                }
                int i = lbpVar2.b;
                int i2 = lhn.SUCCESS.e;
                String str2 = lfwVar.d;
                if (i != i2) {
                    if (lbpVar2.b == lhn.BACKOFF.e) {
                        Map map = lfvVar.t;
                        lfu lfuVar = (lfu) map.get(str2);
                        if (lfuVar == null) {
                            lfuVar = new lfu(lfvVar);
                            map.put(str2, lfuVar);
                        } else {
                            lfuVar.b++;
                            lfuVar.c = lfuVar.a();
                        }
                        long j2 = lfuVar.c;
                        lfvVar.aV();
                        lfvVar.aT().k.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, str2, Long.valueOf((j2 - System.currentTimeMillis()) / 1000));
                    }
                    lgp lgpVarV2 = lfvVar.v();
                    Long lValueOf = Long.valueOf(lbpVar2.a);
                    lgpVarV2.U(lValueOf);
                    lfvVar.aT().k.c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, lValueOf);
                    return;
                }
                Map map2 = lfvVar.t;
                if (map2.containsKey(str2)) {
                    map2.remove(str2);
                }
                lgp lgpVarV3 = lfvVar.v();
                Long lValueOf2 = Long.valueOf(lbpVar2.a);
                lgpVarV3.R(lValueOf2);
                lfvVar.aT().k.c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, lValueOf2);
                long j3 = lbpVar2.c;
                if (j3 > 0) {
                    lgp lgpVarV4 = lfvVar.v();
                    lgpVarV4.o();
                    lgpVarV4.w();
                    Long lValueOf3 = Long.valueOf(j3);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("upload_type", Integer.valueOf(lho.GOOGLE_SIGNAL.g));
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    try {
                        if (lgpVarV4.e().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j3), str, String.valueOf(lho.GOOGLE_SIGNAL_PENDING.g)}) != 1) {
                            lgpVarV4.aT().f.c("Google Signal pending batch not updated. appId, rowId", str, lValueOf3);
                        }
                        lfvVar.aT().k.c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(lbpVar2.c));
                        lfvVar.ab(str);
                    } catch (SQLiteException e6) {
                        lgpVarV4.aT().c.d("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j3), e6);
                        throw e6;
                    }
                }
            }
        });
    }
}
