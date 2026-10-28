package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.util.SizeF;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class usu {
    public final Context a;
    public final quc b;
    public final urz c;
    public ust d;
    public List e;
    public final aaok f;
    private final auhs g;

    public usu(Context context, auhs auhsVar, quc qucVar, urz urzVar, aaok aaokVar) {
        context.getClass();
        auhsVar.getClass();
        aaokVar.getClass();
        this.a = context;
        this.g = auhsVar;
        this.b = qucVar;
        this.c = urzVar;
        this.f = aaokVar;
        agkj agkjVar = urzVar.e;
        agkjVar.getClass();
        agkj agkjVar2 = urzVar.f;
        agkjVar2.getClass();
        this.d = new ust(auhsVar, agkjVar, agkjVar2);
        this.e = awno.a;
    }

    public final qvq a(long j) {
        Object next;
        Optional optionalC = this.c.c(j);
        qvq qvqVar = null;
        if (!optionalC.isEmpty()) {
            UUID uuid = (UUID) optionalC.get();
            agkz agkzVarC = this.b.c();
            agkzVarC.getClass();
            Iterator<E> it = agkzVarC.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!awrc.c(((qvu) next).m, uuid));
            qvqVar = next instanceof qvq ? (qvq) next : null;
            if (qvqVar == null) {
                throw new IllegalStateException("CreationAudioSegment with id " + j + " mapped to ME segment " + uuid + ", but no such ME segment was found");
            }
        }
        return qvqVar;
    }

    public final qvs b(long j) {
        Object next;
        Optional optionalC = this.c.c(j);
        qvs qvsVar = null;
        if (!optionalC.isEmpty()) {
            UUID uuid = (UUID) optionalC.get();
            agkz agkzVarC = this.b.c();
            agkzVarC.getClass();
            Iterator<E> it = agkzVarC.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!awrc.c(((qvu) next).m, uuid));
            qvsVar = next instanceof qvs ? (qvs) next : null;
            if (qvsVar == null) {
                throw new IllegalStateException("CreationGraphicalSegment with id " + j + " mapped to ME segment " + uuid + ", but no such ME segment was found");
            }
        }
        return qvsVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public final void c(aufa aufaVar, qvq qvqVar, utc utcVar) {
        boolean z;
        int i;
        qwo qwoVarB;
        aigu aiguVar = aufaVar.f;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        aiguVar.getClass();
        qvqVar.u(aext.v(aiguVar));
        aigu aiguVar2 = aufaVar.g;
        if (aiguVar2 == null) {
            aiguVar2 = aigu.a;
        }
        aiguVar2.getClass();
        qvqVar.t(aext.v(aiguVar2));
        aigu aiguVar3 = aufaVar.h;
        if (aiguVar3 == null) {
            aiguVar3 = aigu.a;
        }
        aiguVar3.getClass();
        qvqVar.c = nrb.e(aext.v(aiguVar3));
        qvqVar.d = aufaVar.i;
        Boolean bool = utcVar != null ? utcVar.b : null;
        if (bool == null) {
            if ((aufaVar.b & 32) != 0) {
                z = aufaVar.j;
            }
            qvqVar.e = z;
            i = aufaVar.c;
            if (i != 100) {
                qvqVar.b = qwo.c(((aufb) aufaVar.d).c, this.a);
                return;
            }
            if (i == 102) {
                auey aueyVar = (auey) aufaVar.d;
                aueyVar.getClass();
                qwoVarB = this.c.b(aueyVar);
                if (qwoVarB == null) {
                    qvqVar.b = qwo.b(Uri.EMPTY, this.a);
                    qvqVar.o = false;
                } else {
                    qvqVar.b = qwoVarB;
                    qvqVar.o = true;
                }
            }
        }
        bool.booleanValue();
        z = false;
        qvqVar.e = z;
        i = aufaVar.c;
        if (i != 100) {
            qvqVar.b = qwo.c(((aufb) aufaVar.d).c, this.a);
            return;
        }
        if (i == 102) {
            auey aueyVar2 = (auey) aufaVar.d;
            aueyVar2.getClass();
            qwoVarB = this.c.b(aueyVar2);
            if (qwoVarB == null) {
                qvqVar.b = qwo.b(Uri.EMPTY, this.a);
                qvqVar.o = false;
            } else {
                qvqVar.b = qwoVarB;
                qvqVar.o = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:241:0x034d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0395  */
    public final void d(augy augyVar, qvs qvsVar, utc utcVar, Map map) {
        SizeF sizeF;
        qwt qwtVar;
        qvz qvzVar;
        qvx qvxVar;
        qwe qweVar;
        qwk qwkVar;
        qwj qwjVar;
        qwi qwiVar;
        int i;
        qvy qvyVar;
        qwa qwaVar;
        qwg qwgVar;
        int i2;
        aigu aiguVar = augyVar.i;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        aiguVar.getClass();
        qvsVar.u(aext.v(aiguVar));
        aigu aiguVar2 = augyVar.j;
        if (aiguVar2 == null) {
            aiguVar2 = aigu.a;
        }
        aiguVar2.getClass();
        qvsVar.t(aext.v(aiguVar2));
        int i3 = augyVar.b;
        qvsVar.b = (i3 & 4) != 0 ? augyVar.g : 0;
        if ((i3 & 64) != 0) {
            auhp auhpVar = augyVar.k;
            if (auhpVar == null) {
                auhpVar = auhp.a;
            }
            auhpVar.getClass();
            agrf agrfVar = usj.a;
            qvsVar.g = new PointF(auhpVar.c, auhpVar.d);
        } else {
            qvsVar.g = new PointF(0.0f, 0.0f);
        }
        if ((augyVar.b & SemanticState.Focused) != 0) {
            auho auhoVar = augyVar.l;
            if (auhoVar == null) {
                auhoVar = auho.a;
            }
            auhoVar.getClass();
            agrf agrfVar2 = usj.a;
            sizeF = new SizeF(auhoVar.c, auhoVar.d);
        } else {
            sizeF = qvs.a;
        }
        qvsVar.e = sizeF;
        int i4 = augyVar.b;
        qvsVar.f = (i4 & SemanticState.ReadOnly) != 0 ? augyVar.o : 0.0d;
        if ((i4 & SemanticState.Hidden) != 0) {
            auhm auhmVar = augyVar.m;
            if (auhmVar == null) {
                auhmVar = auhm.a;
            }
            agrf agrfVar3 = usj.a;
            RectF rectF = new RectF(auhmVar.b, auhmVar.c, auhmVar.d, auhmVar.e);
            if (((vxz) this.f.b).l(461, 45742939L, false) && !augyVar.n) {
                rectF.top = -rectF.top;
                rectF.bottom = -rectF.bottom;
            }
            qvsVar.h = rectF;
        } else {
            qvsVar.h = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);
        }
        if ((augyVar.b & SemanticState.Multiline) != 0) {
            int iAV = a.aV(augyVar.s);
            if (iAV == 0) {
                iAV = 1;
            }
            int i5 = iAV - 1;
            if (i5 == 2) {
                i2 = 1;
            } else {
                if (i5 != 3) {
                    throw new IllegalArgumentException("Unsupported frame fit: ".concat(Integer.toString(i5)));
                }
                i2 = 2;
            }
            qvsVar.j = i2;
        } else {
            qvsVar.j = qvs.i;
        }
        if (utcVar != null) {
            Float f = utcVar.a;
            qvsVar.c = f != null ? f.floatValue() : 1.0f;
        }
        int i6 = augyVar.c;
        int iE = atxy.e(i6);
        int i7 = iE - 1;
        if (iE == 0) {
            throw null;
        }
        switch (i7) {
            case 0:
                if (!(qvsVar instanceof qvt)) {
                    throw new IllegalStateException("Check failed.");
                }
                augu auguVar = i6 == 101 ? (augu) augyVar.d : augu.a;
                auguVar.getClass();
                ((qvt) qvsVar).k = new qwt(this.c.a(auguVar.g), false);
                return;
            case 1:
                if (!(qvsVar instanceof qvt)) {
                    throw new IllegalStateException("Check failed.");
                }
                augt augtVar = i6 == 102 ? (augt) augyVar.d : augt.a;
                augtVar.getClass();
                ((qvt) qvsVar).k = new qwt(this.c.a(augtVar.e), false);
                return;
            case 2:
                if (!(qvsVar instanceof qvt)) {
                    throw new IllegalStateException("Check failed.");
                }
                augr augrVar = i6 == 103 ? (augr) augyVar.d : augr.a;
                augrVar.getClass();
                ((qvt) qvsVar).k = new qwt(this.c.a(augrVar.c), false);
                return;
            case 3:
            case 12:
                throw new IllegalArgumentException("Unsupported graphical segment type");
            case 4:
                if (!(qvsVar instanceof qvt)) {
                    throw new IllegalStateException("Check failed.");
                }
                augs augsVar = i6 == 105 ? (augs) augyVar.d : augs.a;
                augsVar.getClass();
                ((qvt) qvsVar).k = new qwt(this.c.a(augsVar.c), false);
                return;
            case 5:
                if (!(qvsVar instanceof qvt)) {
                    throw new IllegalStateException("Check failed.");
                }
                augv augvVar = i6 == 106 ? (augv) augyVar.d : augv.a;
                augvVar.getClass();
                ((qvt) qvsVar).k = new qwt(this.c.a(augvVar.c), false);
                return;
            case 6:
                if (!(qvsVar instanceof qvt)) {
                    throw new IllegalStateException("Check failed.");
                }
                auhv auhvVar = i6 == 107 ? (auhv) augyVar.d : auhv.a;
                auhvVar.getClass();
                ((qvt) qvsVar).k = new qwt(this.c.a(auhvVar.e), false);
                return;
            case 7:
                if (!(qvsVar instanceof qwm)) {
                    throw new IllegalStateException("Check failed.");
                }
                auhc auhcVar = i6 == 108 ? (auhc) augyVar.d : auhc.a;
                auhcVar.getClass();
                qwm qwmVar = (qwm) qvsVar;
                aigu aiguVar3 = auhcVar.e;
                if (aiguVar3 == null) {
                    aiguVar3 = aigu.a;
                }
                aiguVar3.getClass();
                qwmVar.v(aext.v(aiguVar3));
                auhl auhlVar = auhcVar.c == 1 ? (auhl) auhcVar.d : auhl.a;
                Context context = this.a;
                String str = auhlVar.c;
                int i8 = qxe.a;
                qwmVar.k = new qxe(nqx.f(Uri.parse(str)), context);
                return;
            case 8:
                if (!(qvsVar instanceof qvt)) {
                    throw new IllegalStateException("Check failed.");
                }
                augz augzVar = i6 == 109 ? (augz) augyVar.d : augz.a;
                augzVar.getClass();
                qvt qvtVar = (qvt) qvsVar;
                if ((augzVar.b == 1 ? (auhk) augzVar.c : auhk.a).d) {
                    String str2 = (augzVar.b == 1 ? (auhk) augzVar.c : auhk.a).c;
                    str2.getClass();
                    Uri uri = Uri.parse(str2);
                    uri.getClass();
                    qwtVar = new qwt(uri, true);
                } else {
                    String str3 = (augzVar.b == 1 ? (auhk) augzVar.c : auhk.a).c;
                    str3.getClass();
                    Uri uri2 = Uri.parse(str3);
                    uri2.getClass();
                    qwtVar = new qwt(uri2, false);
                }
                qvtVar.k = qwtVar;
                return;
            case 9:
                if (!(qvsVar instanceof qwl)) {
                    throw new IllegalStateException("Check failed.");
                }
                auhb auhbVar = i6 == 110 ? (auhb) augyVar.d : auhb.a;
                auhbVar.getClass();
                qwl qwlVar = (qwl) qvsVar;
                qwlVar.A = auhbVar.c;
                int i9 = auhbVar.b;
                qwlVar.D = (i9 & 2) != 0 ? auhbVar.d : -16777216;
                qwlVar.d = (i9 & 4) != 0 ? auhbVar.e : 0;
                qwlVar.I = (i9 & 8) != 0 ? auhbVar.f : 0;
                if ((i9 & 32) != 0) {
                    atzx atzxVarA = atzx.a(auhbVar.h);
                    if (atzxVarA == null) {
                        atzxVarA = atzx.ALIGN_HORIZONTAL_UNSPECIFIED;
                    }
                    agrf agrfVar4 = usj.a;
                    int iOrdinal = atzxVarA.ordinal();
                    if (iOrdinal == 0) {
                        throw new IllegalArgumentException("Alignment has unknown or unrecognized value");
                    }
                    if (iOrdinal == 1) {
                        qwgVar = qwg.a;
                    } else if (iOrdinal == 2) {
                        qwgVar = qwg.c;
                    } else {
                        if (iOrdinal != 3) {
                            throw new RuntimeException(null, null);
                        }
                        qwgVar = qwg.b;
                    }
                    qwlVar.N = qwgVar;
                } else {
                    qwlVar.N = qwl.u;
                }
                float f2 = (auhbVar.b & 64) != 0 ? auhbVar.i : 1.0f;
                ahno.F(Math.signum(f2) != -1.0f);
                qwlVar.C = f2;
                float f3 = (auhbVar.b & SemanticState.Focused) != 0 ? auhbVar.j : 0.0f;
                ahno.F(Math.signum(f3) != -1.0f);
                qwlVar.K = f3;
                float f4 = (auhbVar.b & SemanticState.Hidden) != 0 ? auhbVar.k : 0.0f;
                ahno.F(Math.signum(f4) != -1.0f);
                qwlVar.W = f4;
                float f5 = (auhbVar.b & SemanticState.LiveRegion) != 0 ? auhbVar.l : 0.0f;
                ahno.F(Math.signum(f5) != -1.0f);
                qwlVar.X = f5;
                float f6 = (auhbVar.b & SemanticState.ReadOnly) != 0 ? auhbVar.m : 0.0f;
                ahno.F(Math.signum(f6) != -1.0f);
                qwlVar.Y = f6;
                float f7 = (auhbVar.b & 32768) != 0 ? auhbVar.r : 0.0f;
                ahno.F(Math.signum(f7) != -1.0f);
                qwlVar.aa = f7;
                qwlVar.B = (auhbVar.b & 16) != 0 ? auhbVar.g : "sans-serif";
                if (!awrc.c(auhbVar.g, "YOUTUBE_SANS")) {
                    aqkj aqkjVar = auhbVar.o;
                    if (aqkjVar == null) {
                        aqkjVar = aqkj.a;
                    }
                    aqkm aqkmVar = aqkjVar.c;
                    if (aqkmVar == null) {
                        aqkmVar = aqkm.a;
                    }
                    aqkl aqklVar = aqkmVar.e;
                    if (aqklVar == null) {
                        aqklVar = aqkl.a;
                    }
                    if ((aqklVar.b & 1) != 0) {
                        aqkj aqkjVar2 = auhbVar.o;
                        if (aqkjVar2 == null) {
                            aqkjVar2 = aqkj.a;
                        }
                        aqkm aqkmVar2 = aqkjVar2.c;
                        if (aqkmVar2 == null) {
                            aqkmVar2 = aqkm.a;
                        }
                        aqkl aqklVar2 = aqkmVar2.e;
                        if (aqklVar2 == null) {
                            aqklVar2 = aqkl.a;
                        }
                        aqko aqkoVarA = aqko.a(aqklVar2.c);
                        if (aqkoVarA == null) {
                            aqkoVarA = aqko.TEXT_FONT_WEIGHT_NORMAL;
                        }
                        switch (aqkoVarA.ordinal()) {
                            case 1:
                                qvzVar = qvz.b;
                                break;
                            case 2:
                                qvzVar = qvz.c;
                                break;
                            case 3:
                                qvzVar = qvz.d;
                                break;
                            case 4:
                            default:
                                qvzVar = qvz.e;
                                break;
                            case 5:
                                qvzVar = qvz.f;
                                break;
                            case 6:
                                qvzVar = qvz.g;
                                break;
                            case 7:
                                qvzVar = qvz.h;
                                break;
                            case 8:
                                qvzVar = qvz.i;
                                break;
                            case 9:
                                qvzVar = qvz.j;
                                break;
                        }
                    } else {
                        qvzVar = qvz.e;
                    }
                } else {
                    qvzVar = qvz.h;
                }
                qwlVar.E = qvzVar;
                qwlVar.H = auhbVar.j > 0.0f ? qwb.d : qwb.b;
                int i10 = auhbVar.b;
                qwlVar.Z = (i10 & SemanticState.Modal) != 0 ? auhbVar.n : true;
                if ((i10 & SemanticState.Multiline) == 0) {
                    qvxVar = qwl.y;
                } else {
                    aqkf aqkfVar = auhbVar.p;
                    if (aqkfVar == null) {
                        aqkfVar = aqkf.a;
                    }
                    if ((aqkfVar.b & 8) != 0) {
                        aqkf aqkfVar2 = auhbVar.p;
                        if (aqkfVar2 == null) {
                            aqkfVar2 = aqkf.a;
                        }
                        int iAS = a.aS(aqkfVar2.f);
                        if (iAS == 0) {
                            iAS = 1;
                        }
                        int i11 = iAS - 1;
                        agrf agrfVar5 = usj.a;
                        qvxVar = i11 != 2 ? qvx.a : qvx.b;
                    } else {
                        qvxVar = qwl.y;
                    }
                }
                qwlVar.ab = qvxVar;
                aqkj aqkjVar3 = auhbVar.o;
                if (aqkjVar3 == null) {
                    aqkjVar3 = aqkj.a;
                }
                aqkm aqkmVar3 = aqkjVar3.c;
                if (aqkmVar3 == null) {
                    aqkmVar3 = aqkm.a;
                }
                aqkl aqklVar3 = aqkmVar3.e;
                if (aqklVar3 == null) {
                    aqklVar3 = aqkl.a;
                }
                if ((aqklVar3.b & 2) != 0) {
                    aqkq aqkqVarA = aqkq.a(aqklVar3.d);
                    if (aqkqVarA == null) {
                        aqkqVarA = aqkq.TEXT_FONT_WIDTH_NORMAL;
                    }
                    switch (aqkqVarA.ordinal()) {
                        case 1:
                            qwaVar = qwa.b;
                            break;
                        case 2:
                            qwaVar = qwa.c;
                            break;
                        case 3:
                            qwaVar = qwa.d;
                            break;
                        case 4:
                            qwaVar = qwa.e;
                            break;
                        case 5:
                            qwaVar = qwa.f;
                            break;
                        case 6:
                            qwaVar = qwa.g;
                            break;
                        case 7:
                            qwaVar = qwa.h;
                            break;
                        case 8:
                            qwaVar = qwa.i;
                            break;
                        case 9:
                            qwaVar = qwa.j;
                            break;
                        default:
                            qwaVar = qwa.a;
                            break;
                    }
                    qwlVar.F = qwaVar;
                } else {
                    qwlVar.F = qwl.l;
                }
                if ((aqklVar3.b & 4) != 0) {
                    aqkn aqknVarA = aqkn.a(aqklVar3.e);
                    if (aqknVarA == null) {
                        aqknVarA = aqkn.TEXT_FONT_SLANT_UPRIGHT;
                    }
                    int iOrdinal2 = aqknVarA.ordinal();
                    if (iOrdinal2 != 1) {
                        qvyVar = iOrdinal2 != 2 ? qvy.a : qvy.c;
                    } else {
                        qvyVar = qvy.b;
                    }
                    qwlVar.G = qvyVar;
                } else {
                    qwlVar.G = qwl.r;
                }
                if ((aqkmVar3.b & 8) != 0) {
                    int iAV2 = a.aV(aqkmVar3.f);
                    if (iAV2 == 0) {
                        iAV2 = 3;
                    }
                    int i12 = iAV2 - 1;
                    if (i12 == 1) {
                        i = 2;
                    } else if (i12 != 2) {
                        i = i12 != 3 ? 1 : 4;
                    } else {
                        i = 3;
                    }
                    qwlVar.af = i;
                } else {
                    qwlVar.af = qwl.ae;
                }
                aqkg aqkgVar = aqkjVar3.e;
                if (aqkgVar == null) {
                    aqkgVar = aqkg.a;
                }
                int i13 = aqkgVar.b;
                if ((i13 & 1) != 0) {
                    int iBc = a.bc(aqkgVar.c);
                    if (iBc == 0) {
                        iBc = 1;
                    }
                    int i14 = iBc - 1;
                    if (i14 == 1) {
                        qwiVar = qwi.b;
                    } else if (i14 == 2) {
                        qwiVar = qwi.c;
                    } else if (i14 != 3) {
                        qwiVar = i14 != 4 ? qwi.a : qwi.a;
                    } else {
                        qwiVar = qwi.d;
                    }
                    qwlVar.O = qwiVar;
                } else {
                    qwlVar.O = qwl.v;
                }
                if ((i13 & 4) != 0) {
                    int iAS2 = a.aS(aqkgVar.e);
                    if (iAS2 == 0) {
                        iAS2 = 3;
                    }
                    int i15 = iAS2 - 1;
                    if (i15 != 1) {
                        qwjVar = i15 != 2 ? qwj.a : qwj.a;
                    } else {
                        qwjVar = qwj.b;
                    }
                    qwlVar.Q = qwjVar;
                } else {
                    qwlVar.Q = qwl.x;
                }
                if ((i13 & 2) != 0) {
                    int iBt = a.bt(aqkgVar.d);
                    if (iBt == 0) {
                        iBt = 2;
                    }
                    int i16 = iBt - 1;
                    if (i16 == 1) {
                        qwkVar = qwk.a;
                    } else if (i16 == 2) {
                        qwkVar = qwk.b;
                    } else if (i16 == 3) {
                        qwkVar = qwk.c;
                    } else if (i16 != 4) {
                        qwkVar = i16 != 5 ? qwk.a : qwk.e;
                    } else {
                        qwkVar = qwk.d;
                    }
                    qwlVar.P = qwkVar;
                } else {
                    qwlVar.P = qwl.w;
                }
                aqki aqkiVar = aqkjVar3.f;
                if (aqkiVar == null) {
                    aqkiVar = aqki.a;
                }
                if ((aqkiVar.b & 1) != 0) {
                    ajwe ajweVar = aqkiVar.c;
                    if (ajweVar == null) {
                        ajweVar = ajwe.a;
                    }
                    qwlVar.R = Color.argb(avkz.h(ajweVar.f * 255.0f), avkz.h(ajweVar.c * 255.0f), avkz.h(ajweVar.d * 255.0f), avkz.h(ajweVar.e * 255.0f));
                } else {
                    qwlVar.R = -16777216;
                }
                aqkh aqkhVar = aqkjVar3.d;
                if (aqkhVar == null) {
                    aqkhVar = aqkh.a;
                }
                if ((aqkhVar.b & 16) != 0) {
                    int iAV3 = a.aV(aqkhVar.g);
                    if (iAV3 == 0) {
                        iAV3 = 3;
                    }
                    int i17 = iAV3 - 1;
                    agrf agrfVar6 = usj.a;
                    if (i17 != 1) {
                        qweVar = i17 != 3 ? qwe.b : qwe.c;
                    } else {
                        qweVar = qwe.a;
                    }
                    qwlVar.L = qweVar;
                } else {
                    qwlVar.L = qwl.t;
                }
                if ((aqkhVar.b & 32) != 0) {
                    qwlVar.b(aqkhVar.h);
                    return;
                } else {
                    qwlVar.b(2.0f);
                    return;
                }
            case 10:
                if (!(qvsVar instanceof qvr)) {
                    throw new IllegalStateException("Check failed.");
                }
                ((qvr) qvsVar).d = (i6 == 111 ? (augx) augyVar.d : augx.a).b;
                return;
            case 11:
                if (!(qvsVar instanceof qvw)) {
                    throw new IllegalStateException("Check failed.");
                }
                qvw qvwVar = (qvw) qvsVar;
                auha auhaVar = i6 == 112 ? (auha) augyVar.d : auha.a;
                auhaVar.getClass();
                akcw akcwVar = (akcw) map.get(auhaVar.c);
                if (akcwVar != null) {
                    String str4 = (akcwVar.c == 3 ? (amsy) akcwVar.d : amsy.a).c;
                    str4.getClass();
                    if (str4.length() != 0) {
                        qvwVar.k.d = tyu.a((akcwVar.c == 3 ? (amsy) akcwVar.d : amsy.a).c);
                        aqae aqaeVar = auhaVar.d;
                        if (aqaeVar == null) {
                            aqaeVar = aqae.a;
                        }
                        aqaeVar.getClass();
                        akcy akcyVar = (akcy) DesugarCollections.unmodifiableMap(aqaeVar.b).get("_txt_0");
                        if (akcyVar != null) {
                            qvwVar.l = akcyVar.b == 1 ? (String) akcyVar.c : "";
                        }
                        akcy akcyVar2 = (akcy) DesugarCollections.unmodifiableMap(aqaeVar.b).get("_txt_1");
                        if (akcyVar2 != null) {
                            qvwVar.r = akcyVar2.b == 1 ? (String) akcyVar2.c : "";
                            return;
                        }
                        return;
                    }
                }
                this.b.h(qvwVar);
                this.c.f(augyVar.e);
                return;
            default:
                throw new awmj();
        }
    }

    public final void e(aufd aufdVar, qvs qvsVar, qvs qvsVar2) {
        aufi aufiVar = aufdVar.c == 3 ? (aufi) aufdVar.d : aufi.a;
        String str = (aufiVar.b == 1 ? (aufk) aufiVar.c : aufk.a).c;
        str.getClass();
        qxi qxiVar = new qxi(new qwx(tyu.a(str), this.a));
        if (qvsVar != null) {
            qxiVar.e = qvsVar;
        }
        if (qvsVar2 != null) {
            qxiVar.f = qvsVar2;
        }
        aufh aufhVar = aufdVar.h;
        if (aufhVar == null) {
            aufhVar = aufh.a;
        }
        aigu aiguVar = aufhVar.e;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        aiguVar.getClass();
        Duration durationV = aext.v(aiguVar);
        aufh aufhVar2 = aufdVar.h;
        if (aufhVar2 == null) {
            aufhVar2 = aufh.a;
        }
        aigu aiguVar2 = aufhVar2.d;
        if (aiguVar2 == null) {
            aiguVar2 = aigu.a;
        }
        aiguVar2.getClass();
        qxiVar.c = nrb.e(durationV.minus(aext.v(aiguVar2)));
        this.b.a.add(qxiVar);
    }
}
