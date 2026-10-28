package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kzi extends gdb implements kzj {
    public kzi() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static kzj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof kzj ? (kzj) iInterfaceQueryLocalInterface : new kzh(iBinder);
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        kuo kumVar;
        kuo kumVar2;
        kuo kumVar3;
        kuo kumVar4 = null;
        kuo kumVar5 = null;
        kzp kznVar = null;
        kzm kzkVar = null;
        kzm kzkVar2 = null;
        kzm kzkVar3 = null;
        kzm kzkVar4 = null;
        kzr kzqVar = null;
        kzr kzqVar2 = null;
        kzr kzqVar3 = null;
        kuo kumVar6 = null;
        kzm kzkVar5 = null;
        kzm kzkVar6 = null;
        kuo kumVar7 = null;
        kuo kumVar8 = null;
        kuo kumVar9 = null;
        kuo kumVar10 = null;
        kuo kumVar11 = null;
        kuo kumVar12 = null;
        kzm kzkVar7 = null;
        kzm kzkVar8 = null;
        kzm kzkVar9 = null;
        kzm kzkVar10 = null;
        kzt kzsVar = null;
        kzm kzkVar11 = null;
        kzm kzkVar12 = null;
        kuo kumVar13 = null;
        kzm kzkVar13 = null;
        kzm kzkVar14 = null;
        kzm kzkVar15 = null;
        kuo kumVar14 = null;
        kzm kzkVar16 = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar4 = iInterfaceQueryLocalInterface instanceof kuo ? (kuo) iInterfaceQueryLocalInterface : new kum(strongBinder);
                }
                kzu kzuVar = (kzu) gdc.a(parcel, kzu.CREATOR);
                long j = parcel.readLong();
                gdc.b(parcel);
                initialize(kumVar4, kzuVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                boolean zF = gdc.f(parcel);
                boolean zF2 = gdc.f(parcel);
                long j2 = parcel.readLong();
                gdc.b(parcel);
                logEvent(string, string2, bundle, zF, zF2, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar16 = iInterfaceQueryLocalInterface2 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface2 : new kzk(strongBinder2);
                }
                long j3 = parcel.readLong();
                gdc.b(parcel);
                logEventAndBundle(string3, string4, bundle2, kzkVar16, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar14 = iInterfaceQueryLocalInterface3 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface3 : new kum(strongBinder3);
                }
                boolean zF3 = gdc.f(parcel);
                long j4 = parcel.readLong();
                gdc.b(parcel);
                setUserProperty(string5, string6, kumVar14, zF3, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zF4 = gdc.f(parcel);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar15 = iInterfaceQueryLocalInterface4 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface4 : new kzk(strongBinder4);
                }
                gdc.b(parcel);
                getUserProperties(string7, string8, zF4, kzkVar15);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar14 = iInterfaceQueryLocalInterface5 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface5 : new kzk(strongBinder5);
                }
                gdc.b(parcel);
                getMaxUserProperties(string9, kzkVar14);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                gdc.b(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                gdc.b(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                gdc.b(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar13 = iInterfaceQueryLocalInterface6 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface6 : new kzk(strongBinder6);
                }
                gdc.b(parcel);
                getConditionalUserProperties(string13, string14, kzkVar13);
                break;
            case 11:
                boolean zF5 = gdc.f(parcel);
                long j7 = parcel.readLong();
                gdc.b(parcel);
                setMeasurementEnabled(zF5, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                gdc.b(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                gdc.b(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                gdc.b(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar13 = iInterfaceQueryLocalInterface7 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface7 : new kum(strongBinder7);
                }
                kuo kuoVar = kumVar13;
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                gdc.b(parcel);
                setCurrentScreen(kuoVar, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar12 = iInterfaceQueryLocalInterface8 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface8 : new kzk(strongBinder8);
                }
                gdc.b(parcel);
                getCurrentScreenName(kzkVar12);
                break;
            case 17:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar11 = iInterfaceQueryLocalInterface9 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface9 : new kzk(strongBinder9);
                }
                gdc.b(parcel);
                getCurrentScreenClass(kzkVar11);
                break;
            case 18:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    kzsVar = iInterfaceQueryLocalInterface10 instanceof kzt ? (kzt) iInterfaceQueryLocalInterface10 : new kzs(strongBinder10);
                }
                gdc.b(parcel);
                setInstanceIdProvider(kzsVar);
                break;
            case 19:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar10 = iInterfaceQueryLocalInterface11 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface11 : new kzk(strongBinder11);
                }
                gdc.b(parcel);
                getCachedAppInstanceId(kzkVar10);
                break;
            case 20:
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar9 = iInterfaceQueryLocalInterface12 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface12 : new kzk(strongBinder12);
                }
                gdc.b(parcel);
                getAppInstanceId(kzkVar9);
                break;
            case 21:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar8 = iInterfaceQueryLocalInterface13 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface13 : new kzk(strongBinder13);
                }
                gdc.b(parcel);
                getGmpAppId(kzkVar8);
                break;
            case 22:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar7 = iInterfaceQueryLocalInterface14 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface14 : new kzk(strongBinder14);
                }
                gdc.b(parcel);
                generateEventId(kzkVar7);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                gdc.b(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                gdc.b(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar12 = iInterfaceQueryLocalInterface15 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface15 : new kum(strongBinder15);
                }
                long j14 = parcel.readLong();
                gdc.b(parcel);
                onActivityStarted(kumVar12, j14);
                break;
            case 26:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar11 = iInterfaceQueryLocalInterface16 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface16 : new kum(strongBinder16);
                }
                long j15 = parcel.readLong();
                gdc.b(parcel);
                onActivityStopped(kumVar11, j15);
                break;
            case 27:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar10 = iInterfaceQueryLocalInterface17 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface17 : new kum(strongBinder17);
                }
                Bundle bundle5 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                gdc.b(parcel);
                onActivityCreated(kumVar10, bundle5, j16);
                break;
            case 28:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar9 = iInterfaceQueryLocalInterface18 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface18 : new kum(strongBinder18);
                }
                long j17 = parcel.readLong();
                gdc.b(parcel);
                onActivityDestroyed(kumVar9, j17);
                break;
            case 29:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar8 = iInterfaceQueryLocalInterface19 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface19 : new kum(strongBinder19);
                }
                long j18 = parcel.readLong();
                gdc.b(parcel);
                onActivityPaused(kumVar8, j18);
                break;
            case 30:
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar7 = iInterfaceQueryLocalInterface20 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface20 : new kum(strongBinder20);
                }
                long j19 = parcel.readLong();
                gdc.b(parcel);
                onActivityResumed(kumVar7, j19);
                break;
            case 31:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 == null) {
                    kumVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar = iInterfaceQueryLocalInterface21 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface21 : new kum(strongBinder21);
                }
                IBinder strongBinder22 = parcel.readStrongBinder();
                if (strongBinder22 != null) {
                    IInterface iInterfaceQueryLocalInterface22 = strongBinder22.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar6 = iInterfaceQueryLocalInterface22 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface22 : new kzk(strongBinder22);
                }
                long j20 = parcel.readLong();
                gdc.b(parcel);
                onActivitySaveInstanceState(kumVar, kzkVar6, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                IBinder strongBinder23 = parcel.readStrongBinder();
                if (strongBinder23 != null) {
                    IInterface iInterfaceQueryLocalInterface23 = strongBinder23.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar5 = iInterfaceQueryLocalInterface23 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface23 : new kzk(strongBinder23);
                }
                long j21 = parcel.readLong();
                gdc.b(parcel);
                performAction(bundle6, kzkVar5, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                IBinder strongBinder24 = parcel.readStrongBinder();
                if (strongBinder24 == null) {
                    kumVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface24 = strongBinder24.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar2 = iInterfaceQueryLocalInterface24 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface24 : new kum(strongBinder24);
                }
                IBinder strongBinder25 = parcel.readStrongBinder();
                if (strongBinder25 == null) {
                    kumVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface25 = strongBinder25.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar3 = iInterfaceQueryLocalInterface25 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface25 : new kum(strongBinder25);
                }
                IBinder strongBinder26 = parcel.readStrongBinder();
                if (strongBinder26 != null) {
                    IInterface iInterfaceQueryLocalInterface26 = strongBinder26.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar6 = iInterfaceQueryLocalInterface26 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface26 : new kum(strongBinder26);
                }
                gdc.b(parcel);
                logHealthData(i2, string19, kumVar2, kumVar3, kumVar6);
                break;
            case 34:
                IBinder strongBinder27 = parcel.readStrongBinder();
                if (strongBinder27 != null) {
                    IInterface iInterfaceQueryLocalInterface27 = strongBinder27.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    kzqVar3 = iInterfaceQueryLocalInterface27 instanceof kzr ? (kzr) iInterfaceQueryLocalInterface27 : new kzq(strongBinder27);
                }
                gdc.b(parcel);
                setEventInterceptor(kzqVar3);
                break;
            case 35:
                IBinder strongBinder28 = parcel.readStrongBinder();
                if (strongBinder28 != null) {
                    IInterface iInterfaceQueryLocalInterface28 = strongBinder28.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    kzqVar2 = iInterfaceQueryLocalInterface28 instanceof kzr ? (kzr) iInterfaceQueryLocalInterface28 : new kzq(strongBinder28);
                }
                gdc.b(parcel);
                registerOnMeasurementEventListener(kzqVar2);
                break;
            case 36:
                IBinder strongBinder29 = parcel.readStrongBinder();
                if (strongBinder29 != null) {
                    IInterface iInterfaceQueryLocalInterface29 = strongBinder29.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    kzqVar = iInterfaceQueryLocalInterface29 instanceof kzr ? (kzr) iInterfaceQueryLocalInterface29 : new kzq(strongBinder29);
                }
                gdc.b(parcel);
                unregisterOnMeasurementEventListener(kzqVar);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(gdc.a);
                gdc.b(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder30 = parcel.readStrongBinder();
                if (strongBinder30 != null) {
                    IInterface iInterfaceQueryLocalInterface30 = strongBinder30.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar4 = iInterfaceQueryLocalInterface30 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface30 : new kzk(strongBinder30);
                }
                int i3 = parcel.readInt();
                gdc.b(parcel);
                getTestFlag(kzkVar4, i3);
                break;
            case 39:
                boolean zF6 = gdc.f(parcel);
                gdc.b(parcel);
                setDataCollectionEnabled(zF6);
                break;
            case 40:
                IBinder strongBinder31 = parcel.readStrongBinder();
                if (strongBinder31 != null) {
                    IInterface iInterfaceQueryLocalInterface31 = strongBinder31.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar3 = iInterfaceQueryLocalInterface31 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface31 : new kzk(strongBinder31);
                }
                gdc.b(parcel);
                isDataCollectionEnabled(kzkVar3);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                gdc.b(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                gdc.b(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                gdc.b(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                gdc.b(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder32 = parcel.readStrongBinder();
                if (strongBinder32 != null) {
                    IInterface iInterfaceQueryLocalInterface32 = strongBinder32.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar2 = iInterfaceQueryLocalInterface32 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface32 : new kzk(strongBinder32);
                }
                gdc.b(parcel);
                getSessionId(kzkVar2);
                break;
            case 48:
                Intent intent = (Intent) gdc.a(parcel, Intent.CREATOR);
                gdc.b(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                kzv kzvVar = (kzv) gdc.a(parcel, kzv.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                gdc.b(parcel);
                setCurrentScreenByScionActivityInfo(kzvVar, string20, string21, j25);
                break;
            case 51:
                kzv kzvVar2 = (kzv) gdc.a(parcel, kzv.CREATOR);
                long j26 = parcel.readLong();
                gdc.b(parcel);
                onActivityStartedByScionActivityInfo(kzvVar2, j26);
                break;
            case 52:
                kzv kzvVar3 = (kzv) gdc.a(parcel, kzv.CREATOR);
                long j27 = parcel.readLong();
                gdc.b(parcel);
                onActivityStoppedByScionActivityInfo(kzvVar3, j27);
                break;
            case 53:
                kzv kzvVar4 = (kzv) gdc.a(parcel, kzv.CREATOR);
                Bundle bundle10 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                gdc.b(parcel);
                onActivityCreatedByScionActivityInfo(kzvVar4, bundle10, j28);
                break;
            case 54:
                kzv kzvVar5 = (kzv) gdc.a(parcel, kzv.CREATOR);
                long j29 = parcel.readLong();
                gdc.b(parcel);
                onActivityDestroyedByScionActivityInfo(kzvVar5, j29);
                break;
            case 55:
                kzv kzvVar6 = (kzv) gdc.a(parcel, kzv.CREATOR);
                long j30 = parcel.readLong();
                gdc.b(parcel);
                onActivityPausedByScionActivityInfo(kzvVar6, j30);
                break;
            case 56:
                kzv kzvVar7 = (kzv) gdc.a(parcel, kzv.CREATOR);
                long j31 = parcel.readLong();
                gdc.b(parcel);
                onActivityResumedByScionActivityInfo(kzvVar7, j31);
                break;
            case 57:
                kzv kzvVar8 = (kzv) gdc.a(parcel, kzv.CREATOR);
                IBinder strongBinder33 = parcel.readStrongBinder();
                if (strongBinder33 != null) {
                    IInterface iInterfaceQueryLocalInterface33 = strongBinder33.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    kzkVar = iInterfaceQueryLocalInterface33 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface33 : new kzk(strongBinder33);
                }
                long j32 = parcel.readLong();
                gdc.b(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(kzvVar8, kzkVar, j32);
                break;
            case 58:
                IBinder strongBinder34 = parcel.readStrongBinder();
                if (strongBinder34 != null) {
                    IInterface iInterfaceQueryLocalInterface34 = strongBinder34.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    kznVar = iInterfaceQueryLocalInterface34 instanceof kzp ? (kzp) iInterfaceQueryLocalInterface34 : new kzn(strongBinder34);
                }
                gdc.b(parcel);
                retrieveAndUploadBatches(kznVar);
                break;
            case 59:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                boolean zF7 = gdc.f(parcel);
                boolean zF8 = gdc.f(parcel);
                long j33 = parcel.readLong();
                long j34 = parcel.readLong();
                gdc.b(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, zF7, zF8, j33, j34);
                break;
            case 60:
                IBinder strongBinder35 = parcel.readStrongBinder();
                if (strongBinder35 != null) {
                    IInterface iInterfaceQueryLocalInterface35 = strongBinder35.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kumVar5 = iInterfaceQueryLocalInterface35 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface35 : new kum(strongBinder35);
                }
                kuo kuoVar2 = kumVar5;
                kzu kzuVar2 = (kzu) gdc.a(parcel, kzu.CREATOR);
                long j35 = parcel.readLong();
                long j36 = parcel.readLong();
                gdc.b(parcel);
                initializeWithElapsedTime(kuoVar2, kzuVar2, j35, j36);
                break;
            case 61:
                long j37 = parcel.readLong();
                long j38 = parcel.readLong();
                gdc.b(parcel);
                resetAnalyticsDataWithElapsedTime(j37, j38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
