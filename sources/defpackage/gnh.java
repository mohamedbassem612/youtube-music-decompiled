package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gnh implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gnh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
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
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo841negate() {
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
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
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
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object, weh] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.$cid) {
            case 0:
                agke agkeVar = gni.a;
                return ((String) this.a).contains((String) obj);
            case 1:
                return ((String) this.a).contains((String) obj);
            case 2:
                return this.a.contains(Integer.valueOf(((aqcm) obj).b));
            case 3:
                alxm alxmVar = (alxm) obj;
                int i = alxmVar.b;
                if (i == 58174010) {
                    if ((i == 58174010 ? (aqjj) alxmVar.c : aqjj.a).c.equals(((hdt) this.a).g)) {
                        return true;
                    }
                }
                break;
            case 4:
                if (!this.a.contains((String) obj)) {
                    return true;
                }
                break;
            case 5:
                return ((hfx) ((hfy) this.a).b.io()).h((zne) obj);
            case 6:
                Duration duration = hia.a;
                if (!((agkz) this.a).contains((String) obj)) {
                    return true;
                }
                break;
            case 7:
                Duration duration2 = hia.a;
                if (!((agkz) this.a).contains((String) obj)) {
                    return true;
                }
                break;
            case 8:
                return ((Float) obj).equals(((hjg) ((hhc) this.a).a).c.get());
            case 9:
                if (!this.a.contains(aaka.a(((anjx) obj).getAudioPlaylistId()))) {
                    return true;
                }
                break;
            case 10:
                if (!this.a.contains(aaka.b(((anyx) obj).getVideoId()))) {
                    return true;
                }
                break;
            case 11:
                if (!this.a.contains(aaka.a(((anuk) obj).getPlaylistId()))) {
                    return true;
                }
                break;
            case 12:
                return ((agjw) this.a).contains((String) obj);
            case 13:
                return ((hpd) this.a).s((hth) obj);
            case 14:
                aamt aamtVarF = ((aaew) this.a).f((String) obj);
                if (aamtVarF != null && !hfn.m(aamtVarF.n)) {
                    return true;
                }
                break;
            case 15:
                aohb aohbVar = ((aohc) obj).c;
                if (aohbVar == null) {
                    aohbVar = aohb.a;
                }
                return ((aaew) this.a).u(aohbVar.c);
            case 16:
                return ((aamo) obj).d().equals(this.a);
            case 17:
                if (!((String) this.a).equals(((aamo) obj).d())) {
                    return true;
                }
                break;
            case 18:
                return ((aofh) obj).d.equals(this.a);
            case 19:
                return ((aofh) obj).d.equals(this.a);
            default:
                agrf agrfVar = hur.a;
                Optional optional = ((hcg) obj).a;
                if (optional.isPresent()) {
                    if (!((agke) this.a).contains(optional.get().b())) {
                        return true;
                    }
                }
                break;
        }
        return false;
    }
}
