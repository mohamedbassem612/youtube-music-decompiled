package defpackage;

import android.content.Context;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class glj implements awmd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ glj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [aunn, java.lang.Object] */
    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object obj;
        switch (this.$cid) {
            case 0:
                return new aesy(((jnj) this.a).f);
            case 1:
                return this.a;
            case 2:
                return (aceu) this.a.io();
            case 3:
                return this.a;
            case 4:
                return ((Context) this.a).getSharedPreferences("PersistentQueuePreferences", 0);
            case 5:
            case 6:
                return this.a;
            case 7:
                ?? r2 = this.a;
                if (((agev) r2.io()).g()) {
                }
                return null;
            case 8:
                return Boolean.FALSE;
            case 9:
                obj = this.a;
                break;
            case 10:
                obj = ((tls) this.a).d;
                break;
            case 11:
                return (Random) this.a.io();
            case 12:
                return ((Context) this.a).getSharedPreferences("DelayedEventMetricsStore.prefs", 0);
            case 13:
            case 14:
                return this.a;
            case 15:
                return ((afpa) this.a).a();
            case 16:
                return ((cc) this.a).getChildFragmentManager();
            case 17:
                return (kro) this.a.io();
            case 18:
                return (String) this.a.io();
            default:
                int i = ahvq.d;
                return auxf.a.io().a((Context) this.a);
        }
        return ((tkr) obj).q;
    }
}
