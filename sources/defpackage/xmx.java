package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xmx extends xjm {
    private String b;

    public xmx(xkd xkdVar) {
        super("mdx_cast", xkdVar);
        this.b = "unknown";
    }

    @Override // defpackage.xjm
    protected final void a(tas tasVar, Set set, Set set2) {
        String str;
        if (tasVar instanceof xmz) {
            str = "play";
        } else {
            if (!(tasVar instanceof xmy)) {
                if (tasVar instanceof xna) {
                    str = "seekTo";
                }
                super.a(tasVar, set, set2);
            }
            str = "pause";
        }
        this.b = str;
        super.a(tasVar, set, set2);
    }

    @Override // defpackage.xjm
    public final gdk b() {
        f("method_start", this.b);
        return super.b();
    }
}
