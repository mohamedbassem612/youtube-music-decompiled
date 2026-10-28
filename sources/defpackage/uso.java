package defpackage;

import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.UUID;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uso implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ uso(Object obj, int i) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v37, types: [awqg, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        vfz vfzVar;
        switch (this.$cid) {
            case 0:
                uzj uzjVar = (uzj) obj;
                if (yno.gt(uzjVar, (String) this.a) && uzjVar.a != null) {
                    return true;
                }
                break;
            case 1:
                return yno.gt((uzj) obj, (String) this.a);
            case 2:
                return ((UUID) this.a).equals(((qvu) obj).m);
            case 3:
                String str = ((akcw) obj).e;
                augy augyVar = (augy) this.a;
                return str.equals((augyVar.c == 112 ? (auha) augyVar.d : auha.a).c);
            case 4:
                if (((augy) obj).e == ((augi) this.a).c) {
                    return true;
                }
                break;
            case 5:
                return ((usd) this.a).i((utv) obj);
            case 6:
                vfz vfzVarFZ = yno.fZ((augy) obj);
                Duration duration = vfzVarFZ.b;
                vfz vfzVar2 = (vfz) this.a;
                Duration duration2 = (Duration) atqq.g(vfzVar2.b, duration);
                Duration duration3 = (Duration) atqq.h(vfzVar2.c, vfzVarFZ.c);
                if (duration2.compareTo(duration3) >= 0) {
                    vfzVar = null;
                } else {
                    long j = vfzVar2.a;
                    Duration durationMinus = duration3.minus(duration2);
                    durationMinus.getClass();
                    vfzVar = new vfz(j, duration2, durationMinus, null, null);
                }
                if (vfzVar != null) {
                    return true;
                }
                break;
            case 7:
                if (((augi) obj).c != ((uts) this.a).a) {
                    return true;
                }
                break;
            case 8:
                return ((agkz) this.a).contains(Long.valueOf(((augy) obj).e));
            case 9:
                if (((augi) obj).c == ((augy) this.a).e) {
                    return true;
                }
                break;
            case 10:
                return ((Boolean) this.a.invoke(obj)).booleanValue();
            case 11:
                agrf agrfVar = vae.a;
                return ((String) this.a).equals(((ajhu) obj).b);
            case 12:
                return ((String) this.a).equals(((ajhu) obj).b);
            case 13:
                if (!((vsv) obj).c.equals(this.a)) {
                    return true;
                }
                break;
            case 14:
                return ((vvi) obj).a.equals(this.a);
            case 15:
                return ((vvi) obj).a.equals(this.a);
            case 16:
                return ((vsv) obj).c.equals(this.a);
            case 17:
                return ((vvi) obj).a.equals(this.a);
            case 18:
                aivt aivtVar = (aivt) obj;
                agqs agqsVarListIterator = ((agke) this.a).listIterator(0);
                while (agqsVarListIterator.hasNext()) {
                    aixo aixoVar = (aixo) agqsVarListIterator.next();
                    aivs aivsVar = aivtVar.c;
                    if (aivsVar == null) {
                        aivsVar = aivs.a;
                    }
                    aixo aixoVarA = aixo.a(aivsVar.d);
                    if (aixoVarA == null) {
                        aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                    }
                    if (aixoVarA == aixoVar) {
                        return true;
                    }
                }
                break;
            case 19:
                Optional optional = ((xdg) obj).i;
                if (optional.isPresent()) {
                    if (Objects.equals(optional.get(), this.a)) {
                        return true;
                    }
                }
                break;
            default:
                return Objects.equals(yno.du((amej) obj).e, this.a);
        }
        return false;
    }
}
