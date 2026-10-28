package defpackage;

import android.os.Bundle;
import app.rive.semantics.SemanticState;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaiu implements aait {
    static final long a;
    static final syj b;
    private static final int c;
    private final awmd d;
    private final isi e;
    private final grj f;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = 14400L;
        b = new syj(0, c);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        c = 14400;
        TimeUnit timeUnit3 = TimeUnit.HOURS;
    }

    public aaiu(awmd awmdVar, grj grjVar, isi isiVar) {
        this.d = awmdVar;
        this.f = grjVar;
        this.e = isiVar;
    }

    @Override // defpackage.aait
    public final void a() {
        awmd awmdVar = this.d;
        ((syn) awmdVar.io()).b("appsearch_full_index_task_name");
        ((syn) awmdVar.io()).b("appsearch_sync_index_task_name");
        b();
    }

    @Override // defpackage.aait
    public final void b() {
        ((syn) this.d.io()).b("appsearch_log_index_snapshot_task_name");
    }

    @Override // defpackage.aait
    public final void c() {
        Bundle bundle = new Bundle();
        bundle.putString("identity_aware_tag", this.f.y());
        bundle.putInt("index_update_trigger", 1);
        ((syn) this.d.io()).d("appsearch_full_index_task_name", 0L, 2, 0, false, bundle, b, false);
    }

    @Override // defpackage.aait
    public final void d() {
        Bundle bundle = new Bundle();
        bundle.putString("identity_aware_tag", this.f.y());
        syn synVar = (syn) this.d.io();
        TimeUnit timeUnit = TimeUnit.HOURS;
        synVar.c("appsearch_log_index_snapshot_task_name", 86400L, a, false, 0, false, bundle, b);
    }

    @Override // defpackage.aait
    public final void e() {
        long j;
        Bundle bundle = new Bundle();
        bundle.putString("identity_aware_tag", this.f.y());
        bundle.putInt("index_update_trigger", 2);
        syn synVar = (syn) this.d.io();
        vyo vyoVar = (vyo) this.e.a;
        aoev aoevVar = vyoVar.b().i;
        if (aoevVar == null) {
            aoevVar = aoev.a;
        }
        if ((aoevVar.c & SemanticState.Modal) != 0) {
            aoev aoevVar2 = vyoVar.b().i;
            if (aoevVar2 == null) {
                aoevVar2 = aoev.a;
            }
            j = aoevVar2.z;
        } else {
            TimeUnit timeUnit = TimeUnit.DAYS;
            j = 604800;
        }
        synVar.c("appsearch_sync_index_task_name", j, a, false, 0, true, bundle, b);
    }
}
