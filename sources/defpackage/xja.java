package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.time.Clock;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xja {
    private static final Object e = new Object();
    public final awmd a;
    private final Boolean f;
    private final xif g;
    private final Map h;
    private final agfr i;
    private final Context j;
    public int d = 1;
    public int b = 0;
    public agkz c = agpr.a;

    public xja(awmd awmdVar, awmd awmdVar2, tqj tqjVar, dov dovVar, Executor executor, Context context, awmd awmdVar3, vyo vyoVar) {
        this.a = awmdVar;
        this.g = dovVar.Q("[LoggingThreadLatencyLogger]");
        int i = tqr.a;
        Boolean boolValueOf = Boolean.valueOf(tqjVar.k(72562));
        this.f = boolValueOf;
        this.i = aguu.al(new wkw(awmdVar3, 16));
        this.j = context;
        if (boolValueOf.booleanValue()) {
            ((oml) awmdVar2.io()).g(new xiw(this, 0));
            ((oml) awmdVar2.io()).g(new xix(this, 0));
        }
        this.h = new xiy();
        vyoVar.c(new xee(4)).af(new jbq(this, executor, 11));
    }

    public final void a(amiu amiuVar, xie xieVar) {
        if (amiuVar.g.isEmpty()) {
            this.g.b();
            return;
        }
        if (this.f.booleanValue() && (amiuVar.b & SemanticState.Multiline) == 0) {
            aihf builder = amiuVar.toBuilder();
            boolean z = this.d == 2;
            builder.copyOnWrite();
            amiu amiuVar2 = (amiu) builder.instance;
            amiuVar2.b |= SemanticState.Multiline;
            amiuVar2.m = z;
            amiuVar = (amiu) builder.build();
        }
        wjr wjrVar = (wjr) this.a.io();
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        amiuVar.getClass();
        alouVar.d = amiuVar;
        alouVar.c = 7;
        wjrVar.A(alosVar, xieVar);
    }

    public final void b(String str, xie xieVar) {
        if (TextUtils.isEmpty(str)) {
            this.g.b();
            return;
        }
        wjr wjrVar = (wjr) this.a.io();
        aihf aihfVarCreateBuilder = amir.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amir amirVar = (amir) aihfVarCreateBuilder.instance;
        str.getClass();
        amirVar.b |= 1;
        amirVar.c = str;
        amir amirVar2 = (amir) aihfVarCreateBuilder.build();
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        amirVar2.getClass();
        alouVar.d = amirVar2;
        alouVar.c = 6;
        wjrVar.A(alosVar, xieVar);
        if (((Boolean) this.i.io()).booleanValue()) {
            Context context = this.j;
            long epochMilli = Clock.systemUTC().instant().toEpochMilli();
            DecimalFormat decimalFormat = new DecimalFormat("###.###");
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.flashing_controller, (ViewGroup) null, false);
            avg.e(context).execute(afwl.i(new xiq((TextView) viewInflate.findViewById(R.id.baselineLogged), str, decimalFormat, epochMilli, context, viewInflate, 0)));
        }
    }

    public final void c(xiz xizVar, xie xieVar) {
        String str = xizVar.b;
        if (TextUtils.isEmpty(str)) {
            this.g.b();
            return;
        }
        if (this.b > 1 && this.c.contains(xizVar.a) && str.hashCode() % this.b != 0) {
            Map map = this.h;
            if (map.containsKey(str)) {
                return;
            }
            map.put(str, e);
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            str.getClass();
            amiuVar.b |= 8;
            amiuVar.g = str;
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
            amiuVar2.c |= 134217728;
            amiuVar2.K = true;
            a((amiu) aihfVarCreateBuilder.build(), xieVar);
            return;
        }
        String str2 = xizVar.a;
        wjr wjrVar = (wjr) this.a.io();
        alos alosVar = (alos) alou.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amiy.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amiy amiyVar = (amiy) aihfVarCreateBuilder2.instance;
        str2.getClass();
        amiyVar.b |= 1;
        amiyVar.c = str2;
        aihfVarCreateBuilder2.copyOnWrite();
        amiy amiyVar2 = (amiy) aihfVarCreateBuilder2.instance;
        str.getClass();
        amiyVar2.b |= 4;
        amiyVar2.d = str;
        amiy amiyVar3 = (amiy) aihfVarCreateBuilder2.build();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        amiyVar3.getClass();
        alouVar.d = amiyVar3;
        alouVar.c = 5;
        wjrVar.A(alosVar, xieVar);
    }
}
