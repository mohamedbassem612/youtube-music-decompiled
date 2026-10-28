package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rqd implements zza {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public rqd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, rpv] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, zza] */
    @Override // defpackage.tnh
    public final /* synthetic */ void a(Object obj) {
        Optional optionalEmpty;
        String strA;
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                ((aqi) this.a).b((acjy) obj);
                return;
            } else {
                this.a.a(((gnq) obj).a);
                return;
            }
        }
        ovo ovoVar = (ovo) obj;
        Object obj2 = ovoVar.a;
        wnq wnqVar = null;
        if (obj2 != null) {
            ajwo ajwoVar = ((alkz) obj2).e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apzi.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                apzh apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                if ((apzhVar.b & SemanticState.Hidden) != 0) {
                    ajue ajueVar = apzhVar.g;
                    if (ajueVar == null) {
                        ajueVar = ajue.b;
                    }
                    optionalEmpty = Optional.of(new wnx(ajueVar));
                } else {
                    optionalEmpty = Optional.empty();
                }
            } else {
                optionalEmpty = Optional.empty();
            }
            Optional optionalOr = optionalEmpty.or(new vnn(ajwoVar, 8));
            if (!optionalOr.isEmpty() && (strA = ((wnx) optionalOr.get()).a()) != null) {
                for (wnq wnqVar2 : ovoVar.i()) {
                    if (wnqVar2.k() && strA.equals(wnqVar2.i())) {
                        wnqVar = wnqVar2;
                        break;
                    }
                }
            }
        }
        if (wnqVar == null) {
            List listI = ovoVar.i();
            if (listI.size() == 1) {
                wnqVar = (wnq) listI.get(0);
            }
        }
        ?? r6 = this.a;
        if (wnqVar != null) {
            r6.b(wnqVar);
        } else {
            r6.a();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, rpv] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, zza] */
    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        int i = this.$cid;
        if (i == 0) {
            this.a.c();
            return;
        }
        ?? r2 = this.a;
        if (i != 1) {
            ((aqi) r2).d(toeVar);
        } else {
            r2.jj(toeVar);
        }
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
