package defpackage;

import android.content.SharedPreferences;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.DesugarCollections;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaau extends aaaq {
    private final SharedPreferences a;
    private final tpq b;

    public aaau(SharedPreferences sharedPreferences, tpq tpqVar, Executor executor) {
        super(executor);
        this.a = sharedPreferences;
        this.b = tpqVar;
    }

    @Override // defpackage.aaaq, defpackage.aaas
    public final ListenableFuture a() {
        return ahng.o(ahno.ar(this.b.a(), new xwd(this, 15), MoreExecutors.directExecutor()));
    }

    @Override // defpackage.aaaq
    public final boolean c() {
        return this.a.getBoolean("com.google.android.libraries.youtube.notification.pref.notification_sound_enabled", true);
    }

    @Override // defpackage.aaas
    public final int d() {
        atpq atpqVar = (atpq) this.b.c();
        if ((atpqVar.b & SemanticState.ReadOnly) != 0) {
            return atpqVar.p;
        }
        return 2;
    }

    @Override // defpackage.aaas
    public final int e() {
        atpq atpqVar = (atpq) this.b.c();
        if ((atpqVar.b & SemanticState.Modal) != 0) {
            return atpqVar.q;
        }
        return 0;
    }

    @Override // defpackage.aaas
    public final long f() {
        return ((atpq) this.b.c()).f;
    }

    @Override // defpackage.aaas
    public final agev g() {
        tpq tpqVar = this.b;
        return (((atpq) tpqVar.c()).b & 64) != 0 ? agev.i(Boolean.valueOf(((atpq) tpqVar.c()).i)) : agdf.a;
    }

    @Override // defpackage.aaas
    public final agev h() {
        atpq atpqVar = (atpq) this.b.c();
        if ((atpqVar.b & SemanticState.Obscured) == 0) {
            return agdf.a;
        }
        aoms aomsVar = atpqVar.r;
        if (aomsVar == null) {
            aomsVar = aoms.a;
        }
        return agev.i(aomsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aaas
    public final agev i(String str) {
        atpq atpqVar = (atpq) this.b.c();
        if (!DesugarCollections.unmodifiableMap(atpqVar.m).containsKey("com.google.android.libraries.youtube.notification.pref.notification_channel_importance".concat(String.valueOf(str)))) {
            return agdf.a;
        }
        Integer num = (Integer) atpqVar.m.get("com.google.android.libraries.youtube.notification.pref.notification_channel_importance".concat(String.valueOf(str)));
        int iIntValue = num != null ? num.intValue() : 0;
        Boolean bool = (Boolean) atpqVar.n.get("com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled".concat(String.valueOf(str)));
        return agev.i(new aaar(iIntValue, bool != null ? bool.booleanValue() : false));
    }

    @Override // defpackage.aaas
    public final agev j() {
        tpq tpqVar = this.b;
        return (((atpq) tpqVar.c()).b & 16) != 0 ? agev.i(Boolean.valueOf(((atpq) tpqVar.c()).g)) : agdf.a;
    }

    @Override // defpackage.aaas
    public final agev k() {
        tpq tpqVar = this.b;
        return (((atpq) tpqVar.c()).b & 32) != 0 ? new agfa(Long.valueOf(((atpq) tpqVar.c()).h)) : agdf.a;
    }

    @Override // defpackage.aaas
    public final ListenableFuture l(String str) {
        return this.b.b(new xwd(str, 14));
    }

    @Override // defpackage.aaas
    public final ListenableFuture m(long j) {
        return this.b.b(new xfj(j, 5));
    }

    @Override // defpackage.aaas
    public final ListenableFuture n(boolean z) {
        return this.b.b(new zjq(z, 4));
    }

    @Override // defpackage.aaas
    public final ListenableFuture o(String str, aaar aaarVar) {
        return this.b.b(new aaat(str, aaarVar, 0));
    }

    @Override // defpackage.aaas
    public final ListenableFuture p(boolean z) {
        return this.b.b(new zjq(z, 3));
    }

    @Override // defpackage.aaas
    public final ListenableFuture q(long j) {
        return this.b.b(new xfj(j, 4));
    }

    @Override // defpackage.aaas
    public final ListenableFuture r(boolean z) {
        return this.b.b(new zjq(z, 5));
    }

    @Override // defpackage.aaas
    public final String s() {
        return ((atpq) this.b.c()).e;
    }

    @Override // defpackage.aaas
    public final boolean t() {
        return ((atpq) this.b.c()).k;
    }
}
