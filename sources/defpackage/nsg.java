package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nsg {
    public nsg() {
        DesugarCollections.synchronizedMap(new WeakHashMap());
        DesugarCollections.synchronizedMap(new WeakHashMap());
        DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public static final alou a(aigj aigjVar, int i) {
        alos alosVar = (alos) alou.a.createBuilder();
        aroi aroiVar = (aroi) b(aigjVar, i).build();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aroiVar.getClass();
        alouVar.d = aroiVar;
        alouVar.c = 368;
        return (alou) alosVar.build();
    }

    public static final aihf b(aigj aigjVar, int i) {
        aihf aihfVarCreateBuilder = aroi.a.createBuilder();
        if (aigjVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aroi aroiVar = (aroi) aihfVarCreateBuilder.instance;
            aroiVar.b |= 1;
            aroiVar.c = aigjVar;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aroi aroiVar2 = (aroi) aihfVarCreateBuilder.instance;
        aroiVar2.d = i - 1;
        aroiVar2.b |= 4;
        return aihfVarCreateBuilder;
    }

    public static final aihf c(aigj aigjVar) {
        aihf aihfVarCreateBuilder = arod.a.createBuilder();
        if (aigjVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            arod arodVar = (arod) aihfVarCreateBuilder.instance;
            arodVar.b |= 1;
            arodVar.c = aigjVar;
        }
        return aihfVarCreateBuilder;
    }

    public static CharSequence d(arqe arqeVar) {
        return ackj.g(" ", arqeVar.b.size() != 0 ? ackj.j((alay[]) arqeVar.b.toArray(new alay[0])) : null);
    }

    public static ajwo e(amax amaxVar) {
        if (amaxVar != null) {
            amar amarVar = amaxVar.d;
            if (amarVar == null) {
                amarVar = amar.a;
            }
            if (((amarVar.b == 62441981 ? (arpx) amarVar.c : arpx.a).b & 4) != 0) {
                amar amarVar2 = amaxVar.d;
                if (amarVar2 == null) {
                    amarVar2 = amar.a;
                }
                ajwo ajwoVar = (amarVar2.b == 62441981 ? (arpx) amarVar2.c : arpx.a).d;
                return ajwoVar == null ? ajwo.a : ajwoVar;
            }
        }
        return null;
    }

    public static CharSequence f(amax amaxVar) {
        alay alayVar;
        if (amaxVar == null) {
            return null;
        }
        amar amarVar = amaxVar.d;
        if (amarVar == null) {
            amarVar = amar.a;
        }
        if (amarVar.b != 62441981) {
            return null;
        }
        amar amarVar2 = amaxVar.d;
        if (amarVar2 == null) {
            amarVar2 = amar.a;
        }
        if (((amarVar2.b == 62441981 ? (arpx) amarVar2.c : arpx.a).b & 1) != 0) {
            amar amarVar3 = amaxVar.d;
            if (amarVar3 == null) {
                amarVar3 = amar.a;
            }
            alayVar = (amarVar3.b == 62441981 ? (arpx) amarVar3.c : arpx.a).c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        return ackj.k(null, alayVar, null, false);
    }

    public static arpe g(arpl arplVar) {
        arpm arpmVar = arplVar.b;
        if (arpmVar == null) {
            arpmVar = arpm.a;
        }
        arpg arpgVar = arpmVar.c;
        if (arpgVar == null) {
            arpgVar = arpg.a;
        }
        if ((arpgVar.b & 1) == 0) {
            return null;
        }
        arpm arpmVar2 = arplVar.b;
        if (arpmVar2 == null) {
            arpmVar2 = arpm.a;
        }
        arpg arpgVar2 = arpmVar2.c;
        if (arpgVar2 == null) {
            arpgVar2 = arpg.a;
        }
        arpd arpdVar = arpgVar2.d;
        if (arpdVar == null) {
            arpdVar = arpd.a;
        }
        return arpdVar.b == 123879355 ? (arpe) arpdVar.c : arpe.a;
    }

    public static CharSequence[] h(List list, vxe vxeVar) {
        if (list.isEmpty()) {
            return null;
        }
        CharSequence[] charSequenceArr = new CharSequence[list.size()];
        for (int i = 0; i < list.size(); i++) {
            charSequenceArr[i] = vxl.a(null, (alay) list.get(i), vxeVar, false);
        }
        return charSequenceArr;
    }

    public static final aihf i(aigj aigjVar) {
        aihf aihfVarCreateBuilder = arof.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        arof arofVar = (arof) aihfVarCreateBuilder.instance;
        arofVar.b |= 1;
        arofVar.c = aigjVar;
        return aihfVarCreateBuilder;
    }

    public static final aihf j(aigj aigjVar) {
        aihf aihfVarCreateBuilder = aroe.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aroe aroeVar = (aroe) aihfVarCreateBuilder.instance;
        aroeVar.b |= 1;
        aroeVar.c = aigjVar;
        return aihfVarCreateBuilder;
    }
}
