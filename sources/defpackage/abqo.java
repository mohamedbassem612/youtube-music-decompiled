package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abqo implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ abqo(acoi acoiVar, Object obj, int i) {
        this.$cid = i;
        this.b = acoiVar;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, xir] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((tbt) ((abqq) this.a).a).c(new aayh(false));
            ?? r8 = this.b;
            if (r8 != 0) {
                r8.n("sw_r");
                tym.ag(tsa.STREAMING_WATCH_PART_RECEIVED);
                return;
            }
            return;
        }
        if (i == 1) {
            boolean z = ((tnw) obj).d;
            ((tbt) ((abqq) this.a).a).c(new aayh(z));
            ?? r9 = this.b;
            if (r9 != 0) {
                r9.f(tau.STREAMING_WATCH_PART_RECEIVED);
                tym.ag(tsa.STREAMING_WATCH_PART_RECEIVED);
                if (z) {
                    aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                    amiuVar.c |= SemanticState.Focused;
                    amiuVar.C = true;
                    aihf aihfVarCreateBuilder2 = amis.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amis amisVar = (amis) aihfVarCreateBuilder2.instance;
                    amisVar.b |= 1;
                    amisVar.c = true;
                    aihfVarCreateBuilder.bx(aihfVarCreateBuilder2);
                    r9.h((amiu) aihfVarCreateBuilder.build());
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            if (((Optional) obj).isPresent()) {
                Object obj2 = this.a;
                acoi acoiVar = (acoi) this.b;
                ((acun) obj2).f(acoiVar.au, acoiVar.bJ);
                ((absg) obj2).u(acoiVar.bY, acoiVar.k);
                return;
            }
            return;
        }
        if (i == 3) {
            abyy abyyVar = new abyy(this.b, 13);
            Optional optional = (Optional) this.a;
            if (true == optional.isPresent()) {
                ((acoi) abyyVar.a).V((acra) optional.get());
                return;
            }
            return;
        }
        if (i == 4) {
            ((acoi) this.a).bl = ((rlc) this.b).a();
            return;
        }
        Throwable th = (Throwable) obj;
        addm addmVar = (addm) this.a;
        if (addmVar.c.m(7, 45381962L) || !addmVar.b) {
            return;
        }
        addmVar.a.f(aslh.LOG_TYPE_INTERNAL_ERROR, ((nrv) this.b).i, th, "InlinePlaybackDelegateCommandHandler delegateInlinePlaybackTrigger onError", new Object[0]);
    }

    public /* synthetic */ abqo(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
