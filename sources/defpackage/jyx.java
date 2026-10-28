package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jyx implements kpe {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jyx(String str, int i) {
        this.$cid = i;
        this.a = str;
        this.b = "";
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kpe
    public final void a(Object obj, Object obj2) {
        ArrayList arrayList;
        ahnn ahnnVar;
        int i = 5;
        int i2 = 0;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                kby kbyVar = new kby((kjc) obj2, 4, (char[]) null);
                jyw jywVar = (jyw) ((jyu) obj).C();
                Parcel parcelC = jywVar.c();
                gdc.e(parcelC, kbyVar);
                parcelC.writeString((String) this.b);
                jywVar.e(3, parcelC);
                return;
            case 1:
                jyz jyzVar = new jyz((kjc) obj2);
                jyw jywVar2 = (jyw) ((jyu) obj).C();
                Parcel parcelC2 = jywVar2.c();
                gdc.e(parcelC2, jyzVar);
                gdc.c(parcelC2, this.a);
                jywVar2.e(1, parcelC2);
                return;
            case 2:
                ?? r11 = this.a;
                jza jzaVar = new jza((jyn) r11, (kjc) obj2);
                jyw jywVar3 = (jyw) ((jyu) obj).C();
                Parcel parcelC3 = jywVar3.c();
                gdc.e(parcelC3, jzaVar);
                gdc.c(parcelC3, r11);
                jywVar3.e(2, parcelC3);
                return;
            case 3:
                khc khcVar = (khc) obj;
                kan kanVar = (kan) this.a;
                kanVar.n();
                khi khiVar = (khi) khcVar.C();
                Context context = khcVar.p;
                kmv kmvVarAp = ksy.ap();
                Parcel parcelC4 = khiVar.c();
                parcelC4.writeString((String) this.b);
                gdc.c(parcelC4, kmvVarAp);
                khiVar.f(5, parcelC4);
                kanVar.w((kjc) obj2);
                return;
            case 4:
                khc khcVar2 = (khc) obj;
                khi khiVar2 = (khi) khcVar2.C();
                Context context2 = khcVar2.p;
                khiVar2.b(((kan) this.b).b, ksy.ap());
                khi khiVar3 = (khi) khcVar2.C();
                kmv kmvVarAp2 = ksy.ap();
                Parcel parcelC5 = khiVar3.c();
                gdc.c(parcelC5, this.a);
                gdc.c(parcelC5, kmvVarAp2);
                khiVar3.f(21, parcelC5);
                ((kjc) obj2).x(null);
                return;
            case 5:
                klj kljVar = (klj) obj;
                kby kbyVar2 = new kby((kjc) obj2, 3, (byte[]) null);
                try {
                    Context context3 = ((kmz) this.b).v;
                    i2 = kte.b(context3).g(context3.getPackageName(), 0).versionCode;
                    break;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                ?? r12 = this.a;
                ((kle) r12).f = i2;
                klk klkVar = (klk) kljVar.C();
                Context context4 = kljVar.p;
                kmv kmvVarAq = ksy.aq();
                Parcel parcelC6 = klkVar.c();
                gdc.e(parcelC6, kbyVar2);
                gdc.c(parcelC6, r12);
                gdc.c(parcelC6, kmvVarAq);
                klkVar.e(1, parcelC6);
                return;
            case 6:
                kxt kxtVar = (kxt) obj;
                kxa kxaVar = kxtVar.a;
                WeakReference weakReference = new WeakReference(((kxs) this.b).a);
                Intent intent = (Intent) this.a;
                GoogleHelp googleHelp = (GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP");
                int i3 = googleHelp.M;
                if (i3 == 0 || i3 == 1) {
                    agit agitVar = kxx.a;
                    synchronized (agitVar) {
                        arrayList = new ArrayList(agitVar);
                        break;
                    }
                    if (!arrayList.isEmpty()) {
                        googleHelp.N = arrayList;
                    }
                }
                qcb qcbVar = googleHelp.S;
                aclc aclcVar = new aclc(kxtVar, weakReference, intent, qcbVar, googleHelp.R);
                if (qcbVar == null) {
                    aclcVar.a(googleHelp);
                    return;
                } else {
                    ixt.T(new kxh(googleHelp, aclcVar), 10);
                    return;
                }
            case 7:
                int i4 = llq.a;
                lls llsVar = new lls((kjc) obj2);
                llt lltVar = (llt) ((llu) obj).C();
                Parcel parcelC7 = lltVar.c();
                gdc.e(parcelC7, llsVar);
                parcelC7.writeString((String) this.a);
                parcelC7.writeString((String) this.b);
                parcelC7.writeString(null);
                lltVar.e(11, parcelC7);
                return;
            case 8:
                int i5 = llq.a;
                ((llt) ((llu) obj).C()).a(new lls((kjc) obj2), "CURRENT:" + ((String) this.b) + ':' + ((String) this.a));
                return;
            default:
                llu lluVar = (llu) obj;
                lls llsVar2 = new lls((kjc) obj2);
                Context context5 = ((kmz) this.a).v;
                yre yreVar = new yre(context5.getPackageManager());
                Object obj3 = this.b;
                String packageName = context5.getPackageName();
                try {
                    ?? r3 = yreVar.b;
                    qnk qnkVar = (qnk) r3.get(packageName);
                    if (qnkVar == null) {
                        qnkVar = new qnk(yreVar, packageName, new qnh(new cmw(yreVar, packageName, i, bArr)));
                        r3.put(packageName, qnkVar);
                    }
                    qnj qnjVar = (qnj) ((agkj) qnkVar.b.io()).getOrDefault(yre.b((String) obj3), null);
                    ahnnVar = qnjVar != null ? (ahnn) qnjVar.b.io() : null;
                    break;
                } catch (Exception unused2) {
                }
                if (ahnnVar == null) {
                    llsVar2.b(new Status(29503, null, null, null), null);
                    return;
                }
                llt lltVar2 = (llt) lluVar.C();
                int iIntValue = ahnnVar.c == 2 ? ((Integer) ahnnVar.d).intValue() : 0;
                String[] strArr = (String[]) ahnnVar.i.toArray(new String[0]);
                byte[] bArrG = ahnnVar.j.G();
                Parcel parcelC8 = lltVar2.c();
                gdc.e(parcelC8, llsVar2);
                parcelC8.writeString((String) obj3);
                parcelC8.writeInt(iIntValue);
                parcelC8.writeStringArray(strArr);
                parcelC8.writeByteArray(bArrG);
                parcelC8.writeString("");
                parcelC8.writeString(null);
                lltVar2.e(13, parcelC8);
                return;
        }
    }

    public /* synthetic */ jyx(Object obj, String str, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = str;
    }

    public /* synthetic */ jyx(kmz kmzVar, Object obj, int i) {
        this.$cid = i;
        this.b = kmzVar;
        this.a = obj;
    }
}
