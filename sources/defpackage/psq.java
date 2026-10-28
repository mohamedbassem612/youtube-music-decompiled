package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase;
import com.google.android.libraries.notifications.platform.internal.room.GnpPerDeviceRoomDatabase;
import com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class psq implements aupn {
    public static String b() {
        return (String) autz.a.io();
    }

    public static SharedPreferences c(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("registration_data", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    public static bec d(Context context, awut awutVar, SharedPreferences sharedPreferences, pxh pxhVar, pfz pfzVar) {
        context.getClass();
        sharedPreferences.getClass();
        pxhVar.getClass();
        pxhVar.a(context);
        List listH = atqq.H(psp.a(sharedPreferences));
        String strA = pfzVar.a(context, "registration_data.pb", false);
        aihf aihfVarCreateBuilder = pym.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        return azt.e(new bgd(qnl.H(aihfVarCreateBuilder)), new bgr(new prq(3)), listH, awutVar, new pbm(strA, 2));
    }

    public static GnpPerDeviceRoomDatabase e(Context context, awou awouVar, pfz pfzVar) {
        context.getClass();
        awouVar.getClass();
        dmo dmoVarG = azt.g(context, GnpPerDeviceRoomDatabase.class, pfzVar.a(context, "gnp_per_device_database", true));
        dmoVarG.c();
        dmoVarG.d(awouVar);
        GnpPerDeviceRoomDatabase gnpPerDeviceRoomDatabase = (GnpPerDeviceRoomDatabase) dmoVarG.a();
        gnpPerDeviceRoomDatabase.getClass();
        return gnpPerDeviceRoomDatabase;
    }

    public static GnpRoomDatabase f(Context context, awou awouVar, pfz pfzVar) {
        context.getClass();
        awouVar.getClass();
        dmo dmoVarG = azt.g(context, GnpRoomDatabase.class, pfzVar.a(context, "gnp_database", true));
        dmoVarG.b((doc[]) Arrays.copyOf(new doc[]{GnpRoomDatabase.l}, 1));
        dmoVarG.c();
        dmoVarG.d(awouVar);
        GnpRoomDatabase gnpRoomDatabase = (GnpRoomDatabase) dmoVarG.a();
        gnpRoomDatabase.getClass();
        return gnpRoomDatabase;
    }

    public static pve g(aunn aunnVar, awou awouVar) {
        aunnVar.getClass();
        awouVar.getClass();
        return new pvo(new pwb(aunnVar, 0), awouVar);
    }

    public static qhf h(agev agevVar) {
        qhf qhfVar = (qhf) ((qen) ((awmd) agevVar.e(new gfy(9))).io());
        qhfVar.getClass();
        return qhfVar;
    }

    public static qgy i(awmd awmdVar) {
        qgy qgyVar = (qgy) awmdVar.io();
        qgyVar.getClass();
        return qgyVar;
    }

    public static qia j(awmd awmdVar) {
        qia qiaVar = (qia) awmdVar.io();
        qiaVar.getClass();
        return qiaVar;
    }

    public static qir k(awmd awmdVar) {
        qir qirVar = (qir) awmdVar.io();
        qirVar.getClass();
        return qirVar;
    }

    public static vxc l(rnu rnuVar, rnn rnnVar, vxu vxuVar) {
        amvc amvcVar = vxuVar.c().f;
        if (amvcVar == null) {
            amvcVar = amvc.a;
        }
        vxc vxcVar = rnuVar;
        if (amvcVar.f) {
            amvc amvcVar2 = vxuVar.c().f;
            if (amvcVar2 == null) {
                amvcVar2 = amvc.a;
            }
            vxcVar = rnuVar;
            if (amvcVar2.d) {
                vxcVar = rnnVar;
            }
        }
        vxcVar.getClass();
        return vxcVar;
    }

    public static omm m(aunn aunnVar, awou awouVar) {
        aunnVar.getClass();
        awouVar.getClass();
        return new omm(aunnVar, awouVar, null);
    }

    public static qnl n(awmd awmdVar) {
        qnl qnlVar = (qnl) awmdVar.io();
        qnlVar.getClass();
        return qnlVar;
    }

    public static qnl o(awmd awmdVar) {
        qnl qnlVar = (qnl) awmdVar.io();
        qnlVar.getClass();
        return qnlVar;
    }

    public static qnl p(awmd awmdVar) {
        qnl qnlVar = (qnl) awmdVar.io();
        qnlVar.getClass();
        return qnlVar;
    }

    public static qnl q(awmd awmdVar) {
        qnl qnlVar = (qnl) awmdVar.io();
        qnlVar.getClass();
        return qnlVar;
    }

    public static ayq r(Context context) {
        context.getClass();
        return new ayq(atqq.aL(new qqv[]{new qpp(new afwv(context)), new qpt()}));
    }

    public static rrq s(ahex ahexVar, ayq ayqVar) {
        ahexVar.getClass();
        ayqVar.getClass();
        qsb qsbVar = qsb.a;
        HashMap map = new HashMap();
        rmp.C(qre.a, map);
        return new rrq(ahexVar, ayqVar, qsbVar, map);
    }

    public static tld t(qbn qbnVar, awut awutVar) {
        qbnVar.getClass();
        return new tld((Object) qbnVar, (Object) awutVar, (byte[]) null);
    }

    public static tld u(final Context context, final awou awouVar, final pfz pfzVar) {
        context.getClass();
        awouVar.getClass();
        return new tld(new ple() { // from class: pto
            @Override // defpackage.ple
            public final Object a(plx plxVar) {
                Object objValueOf = plxVar != null ? Long.valueOf(plxVar.a) : "device_level";
                awou awouVar2 = awouVar;
                Context context2 = context;
                pfz pfzVar2 = pfzVar;
                Objects.toString(objValueOf);
                dmo dmoVarG = azt.g(context2, GnpPerAccountRoomDatabase.class, pfzVar2.a(context2, "".concat(objValueOf.toString().concat("_per_account_gnp_room.db")), true));
                dmoVarG.d(awouVar2);
                return (GnpPerAccountRoomDatabase) dmoVarG.a();
            }
        });
    }

    public static tld v(tld tldVar, tld tldVar2) {
        tldVar.getClass();
        return new tld(new pfn(tldVar2, tldVar, 2));
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
