package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jvv extends gdb implements jvw {
    private final gal a;
    private final ggu b;

    public jvv(Context context, Executor executor, fwz fwzVar) {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
        gao gaoVar = new gao(context, executor, fwzVar);
        this.a = gaoVar;
        this.b = new ggu(gaoVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [gal, java.lang.Object] */
    @Deprecated
    private final kuo d(kuo kuoVar, kuo kuoVar2, boolean z) {
        try {
            Uri uri = (Uri) kun.b(kuoVar);
            Context context = (Context) kun.b(kuoVar2);
            ggu gguVar = this.b;
            return new kun(z ? gguVar.a(uri, gguVar.a.d(context)) : gguVar.b(uri, context));
        } catch (gaq unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [gal, java.lang.Object] */
    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        kuo kumVar;
        kuo kumVar2;
        kuo kumVar3;
        kuo kumVar4;
        kuo kumVar5;
        kuo kumVar6;
        kuo kumVar7;
        int i2 = 0;
        kuo kumVar8 = null;
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString("ms");
                return true;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                gdc.b(parcel);
                ggu gguVar = this.b;
                gguVar.c = string;
                gguVar.d = string2;
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface instanceof kuo ? (kuo) iInterfaceQueryLocalInterface : new kum(strongBinder);
                }
                gdc.b(parcel);
                Uri uri = (Uri) kun.b(kumVar8);
                ggu gguVar2 = this.b;
                uri.getClass();
                try {
                    if (uri.getHost().equals(gguVar2.c) && uri.getPath().equals(gguVar2.d)) {
                        i2 = 1;
                    }
                } catch (NullPointerException unused) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface2 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface2 : new kum(strongBinder2);
                }
                gdc.b(parcel);
                Uri uri2 = (Uri) kun.b(kumVar8);
                ggu gguVar3 = this.b;
                uri2.getClass();
                try {
                    String host = uri2.getHost();
                    Object obj = gguVar3.b;
                    int length = ((String[]) obj).length;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (host.endsWith(((String[]) obj)[i3])) {
                            i2 = 1;
                            parcel2.writeNoException();
                            parcel2.writeInt(i2);
                            return true;
                        }
                    }
                } catch (NullPointerException unused2) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case 5:
                String string3 = parcel.readString();
                gdc.b(parcel);
                this.b.b = string3.split(",");
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    kumVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar = iInterfaceQueryLocalInterface3 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface3 : new kum(strongBinder3);
                }
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface4 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface4 : new kum(strongBinder4);
                }
                gdc.b(parcel);
                kuo kuoVarD = d(kumVar, kumVar8, true);
                parcel2.writeNoException();
                gdc.e(parcel2, kuoVarD);
                return true;
            case 7:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface5 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface5 : new kum(strongBinder5);
                }
                gdc.b(parcel);
                String strC = c(kumVar8);
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 8:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface6 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface6 : new kum(strongBinder6);
                }
                String string4 = parcel.readString();
                gdc.b(parcel);
                String strA = a(kumVar8, string4);
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 9:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface7 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface7 : new kum(strongBinder7);
                }
                gdc.b(parcel);
                this.b.a.f((MotionEvent) kun.b(kumVar8));
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    kumVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar2 = iInterfaceQueryLocalInterface8 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface8 : new kum(strongBinder8);
                }
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface9 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface9 : new kum(strongBinder9);
                }
                gdc.b(parcel);
                kuo kuoVarD2 = d(kumVar2, kumVar8, false);
                parcel2.writeNoException();
                gdc.e(parcel2, kuoVarD2);
                return true;
            case 11:
                parcel.readString();
                gdc.f(parcel);
                gdc.b(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 12:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface10 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface10 : new kum(strongBinder10);
                }
                parcel.createByteArray();
                gdc.b(parcel);
                String strC2 = c(kumVar8);
                parcel2.writeNoException();
                parcel2.writeString(strC2);
                return true;
            case 13:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface11 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface11 : new kum(strongBinder11);
                }
                gdc.b(parcel);
                String strB = b(kumVar8);
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 14:
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 == null) {
                    kumVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar3 = iInterfaceQueryLocalInterface12 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface12 : new kum(strongBinder12);
                }
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 == null) {
                    kumVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar4 = iInterfaceQueryLocalInterface13 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface13 : new kum(strongBinder13);
                }
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface14 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface14 : new kum(strongBinder14);
                }
                gdc.b(parcel);
                String strE = this.a.e((Context) kun.b(kumVar3), (View) kun.b(kumVar4), (Activity) kun.b(kumVar8));
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 15:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface15 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface15 : new kum(strongBinder15);
                }
                gdc.b(parcel);
                this.a.i((View) kun.b(kumVar8));
                parcel2.writeNoException();
                return true;
            case 16:
            default:
                return false;
            case 17:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 == null) {
                    kumVar5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar5 = iInterfaceQueryLocalInterface16 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface16 : new kum(strongBinder16);
                }
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 == null) {
                    kumVar6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar6 = iInterfaceQueryLocalInterface17 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface17 : new kum(strongBinder17);
                }
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 == null) {
                    kumVar7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar7 = iInterfaceQueryLocalInterface18 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface18 : new kum(strongBinder18);
                }
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface19 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface19 : new kum(strongBinder19);
                }
                gdc.b(parcel);
                String strC3 = this.a.c((Context) kun.b(kumVar5), (String) kun.b(kumVar6), (View) kun.b(kumVar7), (Activity) kun.b(kumVar8));
                parcel2.writeNoException();
                parcel2.writeString(strC3);
                return true;
            case 18:
                boolean zK = this.a.k();
                parcel2.writeNoException();
                ClassLoader classLoader = gdc.a;
                parcel2.writeInt(zK ? 1 : 0);
                return true;
            case 19:
                boolean zM = this.a.m();
                parcel2.writeNoException();
                ClassLoader classLoader2 = gdc.a;
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 20:
                gal galVar = this.a;
                int i4 = -1;
                if (galVar instanceof gao) {
                    gal galVar2 = (gal) ((gao) galVar).a.get();
                    if (galVar2 instanceof gap) {
                        i4 = 1;
                    } else if (galVar2 instanceof gaj) {
                        i4 = 2;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i4);
                return true;
        }
    }

    @Override // defpackage.jvw
    @Deprecated
    public final String a(kuo kuoVar, String str) {
        return ((gao) this.a).c((Context) kun.b(kuoVar), str, null, null);
    }

    @Override // defpackage.jvw
    public final String b(kuo kuoVar) {
        return this.a.d((Context) kun.b(kuoVar));
    }

    @Deprecated
    public final String c(kuo kuoVar) {
        return ((gao) this.a).b((Context) kun.b(kuoVar));
    }
}
