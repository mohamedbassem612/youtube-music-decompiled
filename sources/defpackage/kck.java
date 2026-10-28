package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kck extends gdb implements IInterface {
    private final kcs a;
    private final Class b;

    public kck(kcs kcsVar, Class cls) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
        this.a = kcsVar;
        this.b = cls;
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        kcs kcsVar;
        kcs kcsVar2;
        kcs kcsVar3;
        kcs kcsVar4;
        kcs kcsVar5;
        kcs kcsVar6;
        kcs kcsVar7;
        kcs kcsVar8;
        kcs kcsVar9;
        kuo kumVar = null;
        switch (i) {
            case 1:
                kun kunVar = new kun(this.a);
                parcel2.writeNoException();
                ClassLoader classLoader = gdc.a;
                parcel2.writeStrongBinder(kunVar);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar = iInterfaceQueryLocalInterface instanceof kuo ? (kuo) iInterfaceQueryLocalInterface : new kum(strongBinder);
                }
                gdc.b(parcel);
                kcq kcqVar = (kcq) kun.b(kumVar);
                Class cls = this.b;
                if (cls.isInstance(kcqVar) && (kcsVar = this.a) != null) {
                    kcsVar.h((kcq) cls.cast(kcqVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar = iInterfaceQueryLocalInterface2 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface2 : new kum(strongBinder2);
                }
                String string = parcel.readString();
                gdc.b(parcel);
                kcq kcqVar2 = (kcq) kun.b(kumVar);
                Class cls2 = this.b;
                if (cls2.isInstance(kcqVar2) && (kcsVar2 = this.a) != null) {
                    kcsVar2.g((kcq) cls2.cast(kcqVar2), string);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar = iInterfaceQueryLocalInterface3 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface3 : new kum(strongBinder3);
                }
                int i2 = parcel.readInt();
                gdc.b(parcel);
                kcq kcqVar3 = (kcq) kun.b(kumVar);
                Class cls3 = this.b;
                if (cls3.isInstance(kcqVar3) && (kcsVar3 = this.a) != null) {
                    kcsVar3.f((kcq) cls3.cast(kcqVar3), i2);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar = iInterfaceQueryLocalInterface4 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface4 : new kum(strongBinder4);
                }
                gdc.b(parcel);
                kcq kcqVar4 = (kcq) kun.b(kumVar);
                Class cls4 = this.b;
                if (cls4.isInstance(kcqVar4) && (kcsVar4 = this.a) != null) {
                    kcsVar4.b((kcq) cls4.cast(kcqVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar = iInterfaceQueryLocalInterface5 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface5 : new kum(strongBinder5);
                }
                int i3 = parcel.readInt();
                gdc.b(parcel);
                kcq kcqVar5 = (kcq) kun.b(kumVar);
                Class cls5 = this.b;
                if (cls5.isInstance(kcqVar5) && (kcsVar5 = this.a) != null) {
                    kcsVar5.a((kcq) cls5.cast(kcqVar5), i3);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar = iInterfaceQueryLocalInterface6 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface6 : new kum(strongBinder6);
                }
                String string2 = parcel.readString();
                gdc.b(parcel);
                kcq kcqVar6 = (kcq) kun.b(kumVar);
                Class cls6 = this.b;
                if (cls6.isInstance(kcqVar6) && (kcsVar6 = this.a) != null) {
                    kcsVar6.e((kcq) cls6.cast(kcqVar6), string2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar = iInterfaceQueryLocalInterface7 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface7 : new kum(strongBinder7);
                }
                ClassLoader classLoader2 = gdc.a;
                boolean z = parcel.readInt() != 0;
                gdc.b(parcel);
                kcq kcqVar7 = (kcq) kun.b(kumVar);
                Class cls7 = this.b;
                if (cls7.isInstance(kcqVar7) && (kcsVar7 = this.a) != null) {
                    kcsVar7.d((kcq) cls7.cast(kcqVar7), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar = iInterfaceQueryLocalInterface8 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface8 : new kum(strongBinder8);
                }
                int i4 = parcel.readInt();
                gdc.b(parcel);
                kcq kcqVar8 = (kcq) kun.b(kumVar);
                Class cls8 = this.b;
                if (cls8.isInstance(kcqVar8) && (kcsVar8 = this.a) != null) {
                    kcsVar8.c((kcq) cls8.cast(kcqVar8), i4);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar = iInterfaceQueryLocalInterface9 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface9 : new kum(strongBinder9);
                }
                int i5 = parcel.readInt();
                gdc.b(parcel);
                kcq kcqVar9 = (kcq) kun.b(kumVar);
                Class cls9 = this.b;
                if (cls9.isInstance(kcqVar9) && (kcsVar9 = this.a) != null) {
                    kcsVar9.i((kcq) cls9.cast(kcqVar9), i5);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(264205000);
                return true;
            default:
                return false;
        }
    }
}
