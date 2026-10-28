package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class usd {
    private static final agrf g = agrf.h("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/CreationMediaCompositionManager");
    public final uss b;
    public final urs c;
    public final urz d;
    private final zvl h;
    private final quc i;
    public final Object a = new Object();
    private final agke j = agke.r(new uvp(0), new uvp(1));
    private boolean k = false;
    private boolean l = false;
    public qcb f = null;
    public final ujg e = new ujg();

    /* JADX WARN: Code duplicated, block: B:15:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:18:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[LOOP:2: B:16:0x00a6->B:32:?, LOOP_END, SYNTHETIC] */
    public usd(Context context, zvl zvlVar, File file, quc qucVar, uss ussVar, aaok aaokVar, agkz agkzVar) {
        aiie aiieVar;
        Iterator<E> it;
        this.h = zvlVar;
        this.i = qucVar;
        this.b = ussVar;
        this.d = new urz(file);
        auhq auhqVar = (auhq) auhs.a.createBuilder();
        auhqVar.copyOnWrite();
        auhs auhsVar = (auhs) auhqVar.instance;
        auhsVar.b |= 8;
        auhsVar.j = true;
        this.c = new urs((auhs) auhqVar.build());
        agqr it2 = agkzVar.iterator();
        while (it2.hasNext()) {
            Long l = (Long) it2.next();
            long jLongValue = l.longValue();
            urs ursVar = this.c;
            aiie aiieVar2 = ursVar.b.d;
            aiieVar2.getClass();
            if (aiieVar2.isEmpty()) {
                aiieVar = ursVar.b.e;
                aiieVar.getClass();
                if (!aiieVar.isEmpty()) {
                    it = aiieVar.iterator();
                    while (it.hasNext()) {
                        if (((aufa) it.next()).e == jLongValue) {
                        }
                    }
                }
                ursVar.a.add(l);
            } else {
                Iterator<E> it3 = aiieVar2.iterator();
                while (it3.hasNext()) {
                    if (((augy) it3.next()).e != jLongValue) {
                    }
                }
                aiieVar = ursVar.b.e;
                aiieVar.getClass();
                if (!aiieVar.isEmpty()) {
                    it = aiieVar.iterator();
                    while (it.hasNext()) {
                        if (((aufa) it.next()).e == jLongValue) {
                        }
                    }
                }
                ursVar.a.add(l);
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        urs ursVar2 = this.c;
        ursVar2.c(new usv(new usu(context, ursVar2.b, qucVar, this.d, aaokVar)));
        this.c.c(new usy(zvlVar));
    }

    public final long a() {
        return this.c.a();
    }

    public final qvs b(UUID uuid) {
        qvu qvuVar = (qvu) Collection.EL.stream(this.i.c()).filter(new uso(uuid, 2)).findFirst().orElseThrow(new ieu(15));
        if (qvuVar instanceof qvs) {
            return (qvs) qvuVar;
        }
        throw new IllegalStateException("Found Segment but was not a GraphicalSegment.");
    }

    public final auhs c() {
        auhs auhsVar;
        synchronized (this.a) {
            auhsVar = this.c.b;
        }
        return auhsVar;
    }

    public final Duration d() {
        Duration durationL;
        g();
        synchronized (this.a) {
            durationL = usj.l(this.c.b);
        }
        return durationL;
    }

    public final Optional e(long j) {
        Optional optionalC;
        g();
        synchronized (this.a) {
            optionalC = this.d.c(j);
            usa usaVar = new usa(this, j);
            if (true == optionalC.isPresent()) {
                Object obj = optionalC.get();
                usd usdVar = usaVar.a;
                optionalC = usj.n(usdVar.c.b, usaVar.b);
                hqb hqbVar = new hqb(usdVar, (UUID) obj, 16);
                if (true == optionalC.isPresent()) {
                    optionalC = Optional.ofNullable(new usb((augy) optionalC.get(), ((usd) hqbVar.a).b((UUID) hqbVar.b)));
                }
                optionalC.getClass();
            }
            if (true == optionalC.isPresent()) {
                optionalC = Optional.ofNullable(((usb) optionalC.get()).a);
            }
        }
        return optionalC;
    }

    public final Optional f(UUID uuid) {
        Optional optionalOfNullable;
        g();
        synchronized (this.a) {
            optionalOfNullable = Optional.ofNullable((Long) this.d.a.get(uuid));
            hqb hqbVar = new hqb(this, uuid, 17);
            if (true == optionalOfNullable.isPresent()) {
                Object obj = optionalOfNullable.get();
                Object obj2 = hqbVar.a;
                Object obj3 = hqbVar.b;
                optionalOfNullable = Optional.ofNullable(new usb((augy) usj.n(((usd) obj2).c.b, ((Long) obj).longValue()).orElseThrow(new ieu(16)), ((usd) obj2).b((UUID) obj3)));
            }
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(((usb) optionalOfNullable.get()).a);
            }
        }
        return optionalOfNullable;
    }

    public final void g() {
        if (taq.e()) {
            IllegalStateException illegalStateException = new IllegalStateException("CreationMediaCompositionManager called from background thread.");
            zvl zvlVar = this.h;
            zvj zvjVarA = zvk.a();
            zvjVarA.j = 40;
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.d("CreationMediaCompositionManager called from background thread.");
            zvjVarA.f(illegalStateException);
            zvlVar.a(zvjVarA.a());
            ((agrc) ((agrc) ((agrc) g.c()).j(illegalStateException)).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/CreationMediaCompositionManager", "softCheckMainThread", (char) 691, "CreationMediaCompositionManager.java")).t("CreationMediaCompositionManager called from background thread.");
        }
    }

    public final boolean h(utu utuVar) {
        g();
        return k(utuVar);
    }

    public final boolean i(utv utvVar) {
        g();
        return l(utvVar);
    }

    @Deprecated
    public final void j(augy augyVar) {
        long jA = (augyVar.b & 1) != 0 ? augyVar.e : a();
        jrr jrrVar = (jrr) augyVar.toBuilder();
        jrrVar.copyOnWrite();
        augy augyVar2 = (augy) jrrVar.instance;
        augyVar2.b |= 1;
        augyVar2.e = jA;
        h(new utl((augy) jrrVar.build(), this.b));
    }

    public final boolean k(utu utuVar) {
        boolean zL;
        g();
        synchronized (this.a) {
            try {
                zL = l(utuVar.b(this.c.b));
            } catch (utw e) {
                if (!this.k) {
                    this.k = true;
                    zvp.b(zvn.a, zvm.M, "[ShortsCreation][Android][Edit] Failed to apply composition mutation.", e);
                }
                return false;
            }
        }
        return zL;
    }

    public final boolean l(utv utvVar) {
        g();
        synchronized (this.a) {
            urs ursVar = this.c;
            if (ursVar.b(utvVar) != null) {
                return false;
            }
            auhs auhsVar = ursVar.b;
            if (!this.l) {
                agkx agkxVar = new agkx();
                agke agkeVar = this.j;
                int i = ((agpi) agkeVar).d;
                for (int i2 = 0; i2 < i; i2++) {
                    String strA = ((uvo) agkeVar.get(i2)).a(auhsVar);
                    if (strA != null) {
                        agkxVar.c(strA);
                    }
                }
                agkz agkzVarG = agkxVar.g();
                if (!agkzVarG.isEmpty()) {
                    this.l = true;
                    IllegalStateException illegalStateException = new IllegalStateException("Validation error(s): " + ((String) Collection.EL.stream(agkzVarG).sorted().collect(Collectors.joining(", "))) + "\nCaused by mutation ".concat(String.valueOf(utvVar.b())));
                    ((agrc) ((agrc) ((agrc) g.c()).j(illegalStateException)).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/CreationMediaCompositionManager", "softValidateComposition", (char) 568, "CreationMediaCompositionManager.java")).t("Composition validation failed");
                    zvl zvlVar = this.h;
                    zvj zvjVarA = zvk.a();
                    zvjVarA.j = 40;
                    zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                    zvjVarA.f(illegalStateException);
                    zvlVar.a(zvjVarA.a());
                }
            }
            qcb qcbVar = this.f;
            if (qcbVar != null) {
                ((uld) qcbVar.a).C(Optional.ofNullable(null));
            }
            this.e.g(ursVar.b);
            return true;
        }
    }

    public final void m(usc uscVar) {
        this.e.i(uscVar);
    }
}
