package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xrd {
    public final Optional a;
    public igp b;
    private final zwb c;
    private final awmd d;
    private final boolean e;
    private final boolean f;
    private final dd g;
    private final omj h;

    public xrd(zwb zwbVar, omj omjVar, xmr xmrVar, cf cfVar, awmd awmdVar, Optional optional) {
        this.c = zwbVar;
        this.h = omjVar;
        this.d = awmdVar;
        this.a = optional;
        String str = xmrVar.a;
        this.e = str.equals("cl");
        this.f = str.equals("m");
        this.g = cfVar.getSupportFragmentManager();
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [awmd, java.lang.Object] */
    public final boolean a(boolean z, xrc xrcVar) {
        char c;
        int i = 0;
        if (this.e) {
            zwb zwbVar = this.c;
            if (zwbVar.e().m()) {
                this.h.P(this.g, new rqk(xrcVar, 2), null);
                return true;
            }
            if (zwbVar.e().g()) {
                xqv xqvVar = new xqv();
                xqvVar.k = xrcVar;
                xqvVar.h(this.g, "youtube.mdx.mediaroute.MdxLoggedOutWatchHistoryDialogFragment");
                return true;
            }
        } else if (this.f && z && ((Boolean) this.d.io()).booleanValue()) {
            Optional optional = this.a;
            if (!optional.isEmpty()) {
                tbk tbkVarD = ((abjp) ((jnm) optional.get()).d.io()).d(0);
                ArrayList arrayList = new ArrayList(tbkVarD.subList(0, tbkVarD.size()));
                if (Collection.EL.removeIf(arrayList, new hud(8))) {
                    c = arrayList.isEmpty() ? (char) 3 : (char) 2;
                } else {
                    c = 1;
                }
                if (c != 1) {
                    if (c == 2) {
                        xqr xqrVar = new xqr();
                        xqrVar.k = new xrb(this, xrcVar, i);
                        xqrVar.l = true;
                        xqrVar.h(this.g, "youtube.mdx.mediaroute.MdxAudioCastPartlyCastableQueueDialogFragment");
                        return true;
                    }
                    xqq xqqVar = new xqq();
                    xqqVar.l = this.b;
                    xqqVar.k = true;
                    xqqVar.h(this.g, "youtube.mdx.mediaroute.MdxAudioCastNotCastableQueueDialogFragment");
                    return true;
                }
            }
        }
        return false;
    }
}
