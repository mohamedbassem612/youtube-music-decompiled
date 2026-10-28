package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import app.rive.semantics.SemanticState;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeeu implements aeew {
    public final boolean a;
    public final Set b;
    public final Map c;
    public final ReferenceQueue d;
    private final aefj f;

    public aeeu(aefj aefjVar, vxe vxeVar, vxu vxuVar) {
        vxeVar.getClass();
        aefjVar.getClass();
        this.f = aefjVar;
        boolean z = false;
        if (vxuVar != null) {
            amvc amvcVar = vxuVar.c().f;
            if ((amvcVar == null ? amvc.a : amvcVar).g) {
                z = true;
            }
        }
        this.a = z;
        this.b = new HashSet();
        this.c = new HashMap();
        this.d = new ReferenceQueue();
    }

    private static ajnf f(alhk alhkVar) {
        ajwo ajwoVar;
        ajwo ajwoVar2 = null;
        if (alhkVar == null) {
            return null;
        }
        aihh aihhVar = (aihh) ajnf.a.createBuilder();
        alay alayVar = alhkVar.f;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        alayVar.getClass();
        ajnfVar.m = alayVar;
        ajnfVar.b |= 64;
        boolean z = alhkVar.d;
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        ajnfVar2.b |= 8;
        ajnfVar2.l = z;
        alja aljaVar = alhkVar.e;
        if (aljaVar == null) {
            aljaVar = alja.a;
        }
        aihhVar.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
        aljaVar.getClass();
        ajnfVar3.f = aljaVar;
        ajnfVar3.e = 8;
        int i = 16;
        if ((alhkVar.b & 16) != 0) {
            ajwoVar = alhkVar.g;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        if (ajwoVar != null) {
            aihhVar.copyOnWrite();
            ajnf ajnfVar4 = (ajnf) aihhVar.instance;
            ajnfVar4.q = ajwoVar;
            ajnfVar4.b |= SemanticState.Modal;
        }
        if ((alhkVar.b & 32) != 0 && (ajwoVar2 = alhkVar.h) == null) {
            ajwoVar2 = ajwo.a;
        }
        if (ajwoVar2 != null) {
            aihhVar.copyOnWrite();
            ajnf ajnfVar5 = (ajnf) aihhVar.instance;
            ajnfVar5.r = ajwoVar2;
            ajnfVar5.b |= SemanticState.Obscured;
        }
        aiqe aiqeVar = alhkVar.i;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        aihhVar.copyOnWrite();
        ajnf ajnfVar6 = (ajnf) aihhVar.instance;
        aiqeVar.getClass();
        ajnfVar6.v = aiqeVar;
        ajnfVar6.b |= 262144;
        aigj aigjVar = alhkVar.j;
        aihhVar.copyOnWrite();
        ajnf ajnfVar7 = (ajnf) aihhVar.instance;
        aigjVar.getClass();
        ajnfVar7.b |= 2097152;
        ajnfVar7.y = aigjVar;
        if ((alhkVar.b & 1) != 0) {
            alhl alhlVar = alhkVar.c;
            if (alhlVar == null) {
                alhlVar = alhl.a;
            }
            int iBc = a.bc(alhlVar.b);
            if (iBc != 0 && iBc == 2) {
                i = 14;
            }
        }
        aihhVar.copyOnWrite();
        ajnf ajnfVar8 = (ajnf) aihhVar.instance;
        ajnfVar8.d = Integer.valueOf(i - 1);
        ajnfVar8.c = 1;
        return (ajnf) aihhVar.build();
    }

    public final void a() {
        while (true) {
            ReferenceQueue referenceQueue = this.d;
            Reference referencePoll = referenceQueue.poll();
            if (referencePoll == null) {
                return;
            }
            synchronized (referenceQueue) {
                this.c.remove(((aeet) referencePoll).a);
            }
        }
    }

    @Override // defpackage.aeew
    public final void b(alhq alhqVar, View view, Object obj, xgn xgnVar) {
        c(alhqVar, view, obj, xgnVar, this.a, false, null);
    }

    public final void c(final alhq alhqVar, final View view, final Object obj, final xgn xgnVar, final boolean z, boolean z2, final aeem aeemVar) {
        a();
        if (view == null || alhqVar == null) {
            return;
        }
        if (z2) {
            if (view.isShown() && view.isAttachedToWindow()) {
                e(alhqVar, view, xgnVar, z, aeemVar);
                return;
            } else {
                view.post(new Runnable() { // from class: aeer
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view2 = view;
                        if (view2.isShown() && view2.isAttachedToWindow()) {
                            aeem aeemVar2 = aeemVar;
                            boolean z3 = z;
                            xgn xgnVar2 = xgnVar;
                            this.a.e(alhqVar, view2, xgnVar2, z3, aeemVar2);
                        }
                    }
                });
                return;
            }
        }
        this.c.put(alhqVar.c, new acqf(this, alhqVar, view, xgnVar, aeemVar));
        if ((alhqVar.b & 64) != 0) {
            alhm alhmVar = alhqVar.i;
            if (alhmVar == null) {
                alhmVar = alhm.a;
            }
            int iAV = a.aV(alhmVar.b);
            if (iAV != 0 && iAV == 3) {
                return;
            }
        }
        this.b.contains(new Pair(alhqVar, obj));
    }

    @Override // defpackage.aeew
    public final void d(alhq alhqVar, View view, xgn xgnVar) {
        c(alhqVar, view, null, xgnVar, this.a, true, null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    public final void e(alhq alhqVar, View view, xgn xgnVar, boolean z, aeem aeemVar) {
        int i;
        int i2;
        int iAV;
        alhj alhjVar;
        alay alayVar;
        alay alayVar2;
        alhk alhkVar;
        aees aeesVar = new aees(aeemVar, alhqVar, xgnVar);
        aefj aefjVar = this.f;
        aefk aefkVarB = aefjVar.b();
        aefkVarB.a = view;
        alhr alhrVar = alhqVar.h;
        if (alhrVar == null) {
            alhrVar = alhr.a;
        }
        if (alhrVar == null) {
            i = 1;
        } else {
            int iBh = a.bh(alhrVar.c);
            if (iBh == 0) {
                iBh = 1;
            }
            int i3 = iBh - 1;
            if (i3 == 2) {
                i = 2;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5 && i3 != 6) {
                        i = 1;
                    }
                } else if (z) {
                    i = 4;
                }
                i = 2;
            } else if (z) {
                i = 3;
            } else {
                i = 2;
            }
        }
        aefkVarB.l(i);
        alhr alhrVar2 = alhqVar.h;
        if (alhrVar2 == null) {
            alhrVar2 = alhr.a;
        }
        if (alhrVar2 == null) {
            i2 = 2;
        } else {
            int iBh2 = a.bh(alhrVar2.c);
            if (iBh2 == 0) {
                iBh2 = 1;
            }
            int i4 = iBh2 - 1;
            if (i4 == 5) {
                i2 = 1;
            } else {
                if (i4 != 6) {
                    if (i4 == 7) {
                        i2 = 1;
                    } else if (i4 != 8) {
                        i2 = 2;
                    }
                }
                i2 = 3;
            }
        }
        aefkVarB.e(i2);
        aefkVarB.h = aeesVar;
        if ((alhqVar.b & 4) != 0) {
            alho alhoVar = alhqVar.e;
            if (alhoVar == null) {
                alhoVar = alho.a;
            }
            iAV = a.aV(alhoVar.b);
            if (iAV == 0) {
                iAV = 1;
            }
        } else {
            iAV = 2;
        }
        aefkVarB.o(iAV == 3 ? 0 : 1);
        aefkVarB.j(iAV == 2 ? -2 : (int) alhqVar.f);
        alhk alhkVar2 = null;
        if ((alhqVar.b & 2) != 0) {
            alhn alhnVar = alhqVar.d;
            if (alhnVar == null) {
                alhnVar = alhn.a;
            }
            alhjVar = alhnVar.b == 106514900 ? (alhj) alhnVar.c : alhj.a;
        } else {
            alhjVar = null;
        }
        if (alhjVar != null) {
            aefkVarB.g(!alhjVar.e);
            if ((alhjVar.b & 2) != 0) {
                alayVar = alhjVar.f;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            aefkVarB.b = ackj.k(null, alayVar, null, false);
            if ((alhjVar.b & 4) != 0) {
                alayVar2 = alhjVar.g;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            aefkVarB.c = ackj.k(null, alayVar2, null, false);
            if ((alhjVar.b & SemanticState.ReadOnly) != 0) {
                alhi alhiVar = alhjVar.l;
                if (alhiVar == null) {
                    alhiVar = alhi.a;
                }
                alhkVar = alhiVar.b == 47244396 ? (alhk) alhiVar.c : alhk.a;
            } else {
                alhkVar = null;
            }
            aefk aefkVarA = aefkVarB.a(f(alhkVar));
            if ((alhjVar.b & SemanticState.LiveRegion) != 0) {
                alhi alhiVar2 = alhjVar.k;
                if (alhiVar2 == null) {
                    alhiVar2 = alhi.a;
                }
                alhkVar2 = alhiVar2.b == 47244396 ? (alhk) alhiVar2.c : alhk.a;
            }
            aefk aefkVarB2 = aefkVarA.b(f(alhkVar2));
            float f = alhjVar.j;
            if (f <= 0.0f) {
                f = 1.0f;
            }
            aefkVarB2.k(f);
            if (((alhjVar.c == 13 ? (aqle) alhjVar.d : aqle.a).b & 4) != 0) {
                Context context = view.getContext();
                aqlc aqlcVarA = aqlc.a((alhjVar.c == 13 ? (aqle) alhjVar.d : aqle.a).e);
                if (aqlcVarA == null) {
                    aqlcVarA = aqlc.THEME_ATTRIBUTE_UNKNOWN;
                }
                aefkVarB.f(aedn.a(context, aqlcVarA));
            }
        }
        aefjVar.c(aefkVarB.c());
    }
}
