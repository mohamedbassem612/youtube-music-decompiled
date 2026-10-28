package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xvr {
    public static String t(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString("screen");
    }

    public static int u(Bundle bundle) {
        int iBt;
        int i = bundle.getInt("mdx_session_type", -1);
        if (i == -1 || (iBt = a.bt(i)) == 0) {
            return 0;
        }
        int i2 = iBt - 1;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5) {
            return iBt;
        }
        return 0;
    }

    public abstract xvz b();

    public abstract String c();

    public abstract xwc d();

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putString("screen", d().b);
        bundle.putInt("mdx_session_type", i() - 1);
        bundle.putBoolean("displayInAvailableList", true);
        return bundle;
    }

    public abstract String f();

    public abstract boolean g(xvr xvrVar);

    public boolean h() {
        return false;
    }

    public abstract int i();

    public boolean j() {
        return false;
    }

    public List v() {
        return agpi.a;
    }

    public airu w() {
        xvz xvzVarB = b();
        if (xvzVarB == null) {
            return airu.a;
        }
        aihf aihfVarCreateBuilder = airu.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aisn.a.createBuilder();
        aihf aihfVarCreateBuilder3 = aiso.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        aiso aisoVar = (aiso) aihfVarCreateBuilder3.instance;
        aisoVar.b |= 8;
        aisoVar.e = xvzVarB.b;
        aiso aisoVar2 = (aiso) aihfVarCreateBuilder3.build();
        aihfVarCreateBuilder2.copyOnWrite();
        aisn aisnVar = (aisn) aihfVarCreateBuilder2.instance;
        aisoVar2.getClass();
        aisnVar.c = aisoVar2;
        aisnVar.b = 1;
        aisn aisnVar2 = (aisn) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        airu airuVar = (airu) aihfVarCreateBuilder.instance;
        aisnVar2.getClass();
        airuVar.c = aisnVar2;
        airuVar.b |= 1;
        return (airu) aihfVarCreateBuilder.build();
    }
}
