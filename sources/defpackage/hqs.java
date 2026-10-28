package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hqs implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hqs(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v27, types: [java.lang.Object, weh] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        boolean z;
        String artistDisplayName;
        switch (this.$cid) {
            case 0:
                return ((jnm) this.a).o((aamt) obj);
            case 1:
                return ((aaex) this.a).k(((aamh) obj).a);
            case 2:
                return ((jnm) this.a).m((aamt) obj);
            case 3:
                return ((jnm) this.a).s((aamt) obj);
            case 4:
                return ((jnm) this.a).v((aamj) obj);
            case 5:
                return ((jnm) this.a).t((aamj) obj);
            case 6:
                return ((hef) this.a).g((aamj) obj);
            case 7:
                return ((hef) this.a).e((aamj) obj);
            case 8:
                return ((aaew) this.a).f((String) obj);
            case 9:
                aanp aanpVar = (aanp) ((hsa) this.a).a.get((String) obj);
                return aanpVar == null ? aanp.a : aanpVar;
            case 10:
                return this.a;
            case 11:
                hcg hcgVar = (hcg) obj;
                aqmh aqmhVar = hcgVar.h;
                Optional optional = hcgVar.a;
                if (!optional.isPresent()) {
                    throw new IllegalStateException("Empty container Entity.");
                }
                Object obj2 = optional.get();
                if (obj2 instanceof anjx) {
                    z = false;
                    artistDisplayName = ((anjx) obj2).getArtistDisplayName();
                } else {
                    if (!(obj2 instanceof anuk)) {
                        throw new IllegalStateException("Unexpected container Entity: ".concat(obj2.toString()));
                    }
                    anuk anukVar = (anuk) obj2;
                    String ownerDisplayName = anukVar.getOwnerDisplayName();
                    z = anukVar.k() || anukVar.getPlaylistId().equals("SE");
                    artistDisplayName = ownerDisplayName;
                }
                String str = hcgVar.f;
                String str2 = hcgVar.g;
                abuz abuzVar = aqmhVar != null ? new abuz(aqmhVar) : null;
                Object obj3 = this.a;
                jgc jgcVar = (jgc) obj3;
                return jgcVar.l(str, str2, artistDisplayName, abuzVar, jgcVar.h, "", z || txz.g((Context) ((jgc) obj3).e), z);
            case 12:
                Optional optional2 = ((hcg) obj).a;
                if (!optional2.isPresent()) {
                    return ahng.n(Optional.empty());
                }
                jgc jgcVar2 = (jgc) this.a;
                return afxd.f(((hpb) jgcVar2.f).h(optional2.get())).g(new hqt(9), jgcVar2.k);
            case 13:
                huy huyVar = (huy) this.a;
                hpy hpyVar = huyVar.c;
                String str3 = (String) obj;
                ListenableFuture listenableFutureK = hpb.k(hpyVar, str3, false);
                ListenableFuture listenableFutureJ = huyVar.d.j(hpyVar, str3);
                return ahno.av(listenableFutureK, listenableFutureJ).k(new egz(listenableFutureK, listenableFutureJ, str3, 15), huyVar.e);
            case 14:
                return ((kyr) this.a).z((hth) obj);
            case 15:
                aihf builder = ((aily) obj).toBuilder();
                builder.copyOnWrite();
                aily ailyVar = (aily) builder.instance;
                ailyVar.b |= SemanticState.Focused;
                ailyVar.j = ((ibh) this.a).g;
                return (aily) builder.build();
            case 16:
                aihf builder2 = ((aily) obj).toBuilder();
                builder2.copyOnWrite();
                aily ailyVar2 = (aily) builder2.instance;
                Object obj4 = this.a;
                obj4.getClass();
                ailyVar2.t = (aimm) obj4;
                ailyVar2.b |= 262144;
                return (aily) builder2.build();
            case 17:
                return new qcb(this.a);
            case 18:
                return (anzi) ((itj) this.a).d.ap(ankr.class, anzi.class, (ankr) obj, itj.b);
            case 19:
                return (anzi) ((itj) this.a).d.ap(anyx.class, anzi.class, (anyx) obj, itj.b);
            default:
                return (anzi) ((itj) this.a).d.ap(anjx.class, anzi.class, (anjx) obj, itj.b);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
