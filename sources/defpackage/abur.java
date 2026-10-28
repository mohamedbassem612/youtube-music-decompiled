package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abur implements acia {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/player/sequencerv2/SequencerImpl");
    private final Map d;
    private final abuh e;
    private final abwj f;
    private abun h;
    private final adet i;
    public agke a = agpi.a;
    public abul b = new abul(0, null);
    private abuk g = abuk.a;

    public abur(Map map, abuh abuhVar, adet adetVar, abwj abwjVar) {
        this.d = map;
        this.e = abuhVar;
        this.i = adetVar;
        this.f = abwjVar;
    }

    private final void e(abun abunVar, abun abunVar2) {
        abuo abuoVar = (abuo) this.d.get(abunVar.d());
        if (abuoVar != null) {
            abuoVar.c(abunVar, abunVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [axsp, java.lang.Object] */
    public final void a(abmg abmgVar) {
        if (abmgVar != null) {
            adet adetVar = this.i;
            adetVar.j.kk(new abmh(abmgVar));
        }
    }

    public final synchronized void b() {
        abun abunVar = this.h;
        if (abunVar != null) {
            e(abunVar, null);
        }
        this.a = agpi.a;
        this.b = new abul(0, null);
        this.e.b();
    }

    public final synchronized void c(List list, abuk abukVar, abuc abucVar) {
        abul abulVar = abucVar.a;
        int i = abulVar.b;
        ahno.W(i, list.size());
        Integer num = abulVar.c;
        if (num != null) {
            ahno.W(num.intValue(), ((agpi) ((abun) list.get(i)).c()).d);
        }
        this.a = agke.n(list);
        this.g = abukVar;
        d(abucVar);
    }

    public final synchronized void d(abuc abucVar) {
        abul abulVar = abucVar.a;
        abun abunVarF = aasc.f(abulVar, this.a);
        if (abunVarF == null) {
            abun abunVarF2 = aasc.f(new abul(abulVar.b, null), this.a);
            ((agrc) ((agrc) c.b()).k("com/google/android/libraries/youtube/player/sequencerv2/SequencerImpl", "setSequenceIndex", 99, "SequencerImpl.java")).E("Cannot set Sequencer index due to invalid index or size. index=%s, s_size=%d, n_size=%s.", abulVar, Integer.valueOf(this.a.size()), abunVarF2 == null ? "parent_null" : String.valueOf(((agpi) abunVarF2.c()).d));
            return;
        }
        this.b = abulVar;
        abun abunVar = this.h;
        if (abunVar != null) {
            e(abunVar, abunVarF);
        }
        abuo abuoVar = (abuo) this.d.get(abunVarF.d());
        if (abuoVar == null) {
            ((agrc) ((agrc) c.b()).k("com/google/android/libraries/youtube/player/sequencerv2/SequencerImpl", "handleItem", 181, "SequencerImpl.java")).w("No handler for %s", abunVarF.d());
        } else {
            if (this.f.d) {
                a(abucVar.b.g);
            }
            abuoVar.b(abunVarF, abucVar);
            this.h = abunVarF;
        }
        this.e.f(this.a, this.g, this.b);
    }

    @Override // defpackage.acia
    public final void g(final abnl abnlVar) {
        if (this.h != null) {
            zj zjVarT = abuc.t();
            zjVarT.a = abtz.NONE;
            zjVarT.g(this.b);
            zjVarT.c = new abua() { // from class: abuq
                @Override // defpackage.abua
                public final abnl b(abnl abnlVar2) {
                    return abnlVar;
                }
            };
            d(zjVarT.f());
        }
    }
}
