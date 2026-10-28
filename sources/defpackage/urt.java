package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class urt extends uhv {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/CompositionHistoryController");
    public final urv b;
    private final awli d;
    private final awli e;
    private avmn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urt(cc ccVar, urv urvVar, aaok aaokVar) {
        super(ccVar, true);
        ccVar.getClass();
        urvVar.getClass();
        aaokVar.getClass();
        this.b = urvVar;
        this.d = new awli(Optional.empty());
        this.e = new awli();
    }

    private final aeiv n() {
        return this.b.f();
    }

    @Override // defpackage.uhv
    protected final void g() {
        this.f = this.b.d().af(new usn(new rla(this, 10), 1));
    }

    @Override // defpackage.uhv
    protected final void iX() {
        Object obj = this.f;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Collection] */
    public final void l() {
        Optional optionalEmpty;
        Object obj;
        if (n() != null) {
            aeiv aeivVarN = n();
            boolean z = aeivVarN != null ? !aeivVarN.b.isEmpty() : false;
            aeiv aeivVarN2 = n();
            optionalEmpty = Optional.of(new vfy(z, aeivVarN2 != null ? !aeivVarN2.a.isEmpty() : false));
        } else {
            optionalEmpty = Optional.empty();
        }
        this.d.kk(optionalEmpty);
        aeiv aeivVarN3 = n();
        if (aeivVarN3 == null || (obj = aeivVarN3.c) == null) {
            return;
        }
        this.e.kk(((urp) obj).a);
    }

    public final void m(Duration duration) {
        ArrayDeque arrayDeque;
        aeiv aeivVarN = n();
        if (aeivVarN == null) {
            ((agrc) c.c().k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/CompositionHistoryController", "getHistoryOrWarn", 241, "CompositionHistoryController.kt")).t("Composition history is null, ignoring action.");
            return;
        }
        urv urvVar = this.b;
        auhs auhsVarC = urvVar.c();
        if (auhsVarC == null) {
            throw new IllegalStateException("Composition is not initialized.");
        }
        if (!awrc.c(auhsVarC, ((urp) aeivVarN.c).a)) {
            while (true) {
                arrayDeque = (ArrayDeque) aeivVarN.b;
                if (arrayDeque.size() < 25) {
                    break;
                } else {
                    arrayDeque.removeFirst();
                }
            }
            arrayDeque.addLast(aeivVarN.c);
            String string = UUID.randomUUID().toString();
            string.getClass();
            aeivVarN.c = new urp(auhsVarC, "", duration, string);
            ((ArrayDeque) aeivVarN.a).clear();
        }
        urvVar.e(auhsVarC);
        l();
    }
}
