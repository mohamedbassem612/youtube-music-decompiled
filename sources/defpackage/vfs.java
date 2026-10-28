package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vfs {
    public final vft a;
    public final int b;
    public Optional c;
    public final uxb d;
    public auhs e;
    public agke f;
    public agke g;
    public final aaok h;
    private final agke i;
    private agke j;
    private agke k;
    private Uri l;
    private Uri m;
    private String n;

    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x011b  */
    public vfs(vft vftVar, aaok aaokVar) {
        Optional optionalOfNullable;
        urh urhVar;
        auhs auhsVar;
        this.c = Optional.empty();
        uxb uxbVar = new uxb();
        this.d = uxbVar;
        agke agkeVar = agpi.a;
        this.j = agkeVar;
        this.k = agkeVar;
        this.l = Uri.EMPTY;
        this.m = Uri.EMPTY;
        this.e = null;
        this.f = agkeVar;
        this.g = agkeVar;
        this.n = null;
        this.a = vftVar;
        this.h = aaokVar;
        this.b = aaokVar.x();
        Duration.ofMillis(aaokVar.x());
        vftVar.J();
        if (vft.D(vftVar) && (vftVar instanceof vfr)) {
            vftVar.K();
        }
        this.i = agkeVar;
        Optional optionalH = vftVar.h();
        if (d(vftVar)) {
            Duration.ofMillis(aaokVar.y());
        }
        auij auijVar = optionalH.isPresent() ? (auij) optionalH.get() : null;
        if (auijVar != null) {
            if ((auijVar.b & 2) != 0) {
                auhs auhsVar2 = auijVar.d;
                this.e = auhsVar2 == null ? auhs.a : auhsVar2;
            }
            if (this.c.isEmpty() && auijVar.e.size() > 0) {
                this.c = Optional.of((auii) auijVar.e.get(0));
            }
            if (!((vxz) aaokVar.b).l(591, 45836342L, false) || (auhsVar = this.e) == null) {
                optionalOfNullable = this.c;
                if (true == optionalOfNullable.isPresent() && (((auii) optionalOfNullable.get()).b & 32) == 0) {
                    optionalOfNullable = Optional.empty();
                }
                optionalOfNullable = true == optionalOfNullable.isPresent() ? Optional.ofNullable(Float.valueOf(((auii) optionalOfNullable.get()).h)) : optionalOfNullable;
                urhVar = new urh(this, 12);
                if (true == optionalOfNullable.isPresent()) {
                    ((vfs) urhVar.a).d.c(((Float) optionalOfNullable.get()).floatValue(), arfu.VOLUME_TYPE_ADDED_MUSIC);
                }
            } else {
                arfu arfuVar = arfu.VOLUME_TYPE_ADDED_MUSIC;
                if (usj.q(auhsVar, arfuVar).isPresent()) {
                    Optional optionalQ = usj.q(this.e, arfuVar);
                    urh urhVar2 = new urh(this, 11);
                    if (true == optionalQ.isPresent()) {
                        ((vfs) urhVar2.a).d.c(((Float) optionalQ.get()).floatValue(), arfuVar);
                    }
                } else {
                    optionalOfNullable = this.c;
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = Optional.empty();
                    }
                    if (true == optionalOfNullable.isPresent()) {
                    }
                    urhVar = new urh(this, 12);
                    if (true == optionalOfNullable.isPresent()) {
                        ((vfs) urhVar.a).d.c(((Float) optionalOfNullable.get()).floatValue(), arfu.VOLUME_TYPE_ADDED_MUSIC);
                    }
                }
            }
            if ((auijVar.b & 16) != 0) {
                uxbVar.c(auijVar.h, arfu.VOLUME_TYPE_ORIGINAL);
            }
            if (!auijVar.i.isEmpty() && (auijVar.b & 32) != 0) {
                uxbVar.c(auijVar.j, arfu.VOLUME_TYPE_VOICEOVER);
            }
            if (!auijVar.l.isEmpty() && (auijVar.b & SemanticState.Focused) != 0) {
                uxbVar.c(auijVar.m, arfu.VOLUME_TYPE_TEXT_TO_SPEECH);
            }
            if (!agkeVar.isEmpty() && (auijVar.b & SemanticState.Hidden) != 0) {
                uxbVar.c(auijVar.n, arfu.VOLUME_TYPE_VISUAL_REMIX);
            }
            if (!auijVar.g.isEmpty()) {
                this.l = Uri.parse(auijVar.g);
            }
            if (!auijVar.k.isEmpty()) {
                this.m = Uri.parse(auijVar.k);
            }
            if (!aaokVar.G()) {
                this.j = agke.n(auijVar.i);
            }
            this.k = agke.n(auijVar.l);
            if (aaokVar.K()) {
                auex auexVar = auijVar.o;
                this.f = agke.n((auexVar == null ? auex.a : auexVar).b);
                auex auexVar2 = auijVar.o;
                this.g = agke.n((auexVar2 == null ? auex.a : auexVar2).c);
            }
            if (!aaokVar.z() || (auijVar.b & SemanticState.ReadOnly) == 0) {
                return;
            }
            this.n = auijVar.p;
        }
    }

    public static boolean d(vft vftVar) {
        vftVar.H();
        return Collection.EL.stream(vftVar.E().b).anyMatch(new uvm(4));
    }

    public final void a() {
        auhs auhsVar;
        jrq jrqVar = (jrq) auij.a.createBuilder();
        if (!this.l.equals(Uri.EMPTY) && this.l.getPath() != null) {
            String path = this.l.getPath();
            path.getClass();
            jrqVar.copyOnWrite();
            auij auijVar = (auij) jrqVar.instance;
            auijVar.b |= 8;
            auijVar.g = path;
        }
        if (!this.m.equals(Uri.EMPTY) && this.m.getPath() != null) {
            String path2 = this.m.getPath();
            path2.getClass();
            jrqVar.copyOnWrite();
            auij auijVar2 = (auij) jrqVar.instance;
            auijVar2.b |= 64;
            auijVar2.k = path2;
        }
        auhs auhsVar2 = this.e;
        if (auhsVar2 != null) {
            jrqVar.copyOnWrite();
            auij auijVar3 = (auij) jrqVar.instance;
            auijVar3.d = auhsVar2;
            auijVar3.b |= 2;
        }
        uxb uxbVar = this.d;
        float fA = uxbVar.a(arfu.VOLUME_TYPE_ORIGINAL);
        jrqVar.copyOnWrite();
        auij auijVar4 = (auij) jrqVar.instance;
        auijVar4.b |= 16;
        auijVar4.h = fA;
        if (this.c.isPresent()) {
            aihf builder = ((aihn) this.c.get()).toBuilder();
            float fA2 = uxbVar.a(arfu.VOLUME_TYPE_ADDED_MUSIC);
            builder.copyOnWrite();
            auii auiiVar = (auii) builder.instance;
            auiiVar.b |= 32;
            auiiVar.h = fA2;
            auii auiiVar2 = (auii) builder.build();
            jrqVar.copyOnWrite();
            auij auijVar5 = (auij) jrqVar.instance;
            auiiVar2.getClass();
            aiie aiieVar = auijVar5.e;
            if (!aiieVar.c()) {
                auijVar5.e = aihn.mutableCopy(aiieVar);
            }
            auijVar5.e.add(auiiVar2);
        }
        aaok aaokVar = this.h;
        if (!((!aaokVar.G() || (auhsVar = this.e) == null) ? this.j : usj.d(auhsVar)).isEmpty()) {
            float fA3 = uxbVar.a(arfu.VOLUME_TYPE_VOICEOVER);
            jrqVar.copyOnWrite();
            auij auijVar6 = (auij) jrqVar.instance;
            auijVar6.b |= 32;
            auijVar6.j = fA3;
        }
        if (!this.k.isEmpty()) {
            float fA4 = uxbVar.a(arfu.VOLUME_TYPE_TEXT_TO_SPEECH);
            jrqVar.copyOnWrite();
            auij auijVar7 = (auij) jrqVar.instance;
            auijVar7.b |= SemanticState.Focused;
            auijVar7.m = fA4;
        }
        if (!this.i.isEmpty()) {
            float fA5 = uxbVar.a(arfu.VOLUME_TYPE_VISUAL_REMIX);
            jrqVar.copyOnWrite();
            auij auijVar8 = (auij) jrqVar.instance;
            auijVar8.b |= SemanticState.Hidden;
            auijVar8.n = fA5;
        }
        if (!aaokVar.G()) {
            agke agkeVar = this.j;
            jrqVar.copyOnWrite();
            auij auijVar9 = (auij) jrqVar.instance;
            aiie aiieVar2 = auijVar9.i;
            if (!aiieVar2.c()) {
                auijVar9.i = aihn.mutableCopy(aiieVar2);
            }
            aifs.addAll(agkeVar, auijVar9.i);
        }
        agke agkeVar2 = this.k;
        jrqVar.copyOnWrite();
        auij auijVar10 = (auij) jrqVar.instance;
        aiie aiieVar3 = auijVar10.l;
        if (!aiieVar3.c()) {
            auijVar10.l = aihn.mutableCopy(aiieVar3);
        }
        aifs.addAll(agkeVar2, auijVar10.l);
        if (aaokVar.K()) {
            aihf aihfVarCreateBuilder = auex.a.createBuilder();
            agke agkeVar3 = this.f;
            aihfVarCreateBuilder.copyOnWrite();
            auex auexVar = (auex) aihfVarCreateBuilder.instance;
            aiie aiieVar4 = auexVar.b;
            if (!aiieVar4.c()) {
                auexVar.b = aihn.mutableCopy(aiieVar4);
            }
            aifs.addAll(agkeVar3, auexVar.b);
            agke agkeVar4 = this.g;
            aihfVarCreateBuilder.copyOnWrite();
            auex auexVar2 = (auex) aihfVarCreateBuilder.instance;
            aiie aiieVar5 = auexVar2.c;
            if (!aiieVar5.c()) {
                auexVar2.c = aihn.mutableCopy(aiieVar5);
            }
            aifs.addAll(agkeVar4, auexVar2.c);
            auex auexVar3 = (auex) aihfVarCreateBuilder.build();
            jrqVar.copyOnWrite();
            auij auijVar11 = (auij) jrqVar.instance;
            auexVar3.getClass();
            auijVar11.o = auexVar3;
            auijVar11.b |= SemanticState.LiveRegion;
        }
        if (aaokVar.z()) {
            Optional optionalH = this.a.h();
            if (optionalH.isPresent() && (((auij) optionalH.get()).b & SemanticState.ReadOnly) != 0) {
                this.n = ((auij) optionalH.get()).p;
            }
            String str = this.n;
            if (str != null) {
                jrqVar.copyOnWrite();
                auij auijVar12 = (auij) jrqVar.instance;
                auijVar12.b |= SemanticState.ReadOnly;
                auijVar12.p = str;
            }
        }
        this.a.o((auij) jrqVar.build());
    }

    public final void b(auhs auhsVar) {
        c(auhsVar, this.f, this.g);
    }

    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public final void c(auhs auhsVar, agke agkeVar, agke agkeVar2) {
        boolean z;
        boolean z2 = true;
        if (Objects.equals(this.e, auhsVar)) {
            z = false;
        } else {
            this.e = auhsVar;
            z = true;
        }
        if (this.h.K()) {
            if (Objects.equals(this.f, agkeVar)) {
                z2 = z;
            } else {
                this.f = agkeVar;
            }
            if (Objects.equals(this.g, agkeVar2)) {
                z = z2;
                if (!z) {
                    return;
                }
            } else {
                this.g = agkeVar2;
            }
        } else if (!z) {
            return;
        }
        a();
    }
}
