package defpackage;

import android.util.Pair;
import java.util.Comparator;
import java.util.Map;
import java.util.function.ToIntFunction;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ddc implements ToIntFunction {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ddc(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        aldh aldhVarA;
        switch (this.$cid) {
            case 0:
                Comparator comparator = ddd.a;
                return ((ddd) obj).c.a;
            case 1:
                int i = cyo.d;
                return ((cyo) obj).c;
            case 2:
                mar marVar = (mar) obj;
                return Math.min(marVar.b, marVar.a);
            case 3:
                return ((agke) ((Pair) obj).second).size();
            case 4:
                return ((agke) ((Pair) obj).second).size();
            case 5:
                return ((mxb) obj).h();
            case 6:
                return Memory.peekInt(((asxa) obj).c + 12, false);
            case 7:
                aisv aisvVar = (aisv) obj;
                if ((aisvVar.b & 1) == 0) {
                    return 0;
                }
                arcg arcgVar = aisvVar.c;
                if (arcgVar == null) {
                    arcgVar = arcg.a;
                }
                return Math.max(0, arcgVar.s);
            case 8:
                return ((aivk) obj).i;
            case 9:
                return ((qvs) obj).b;
            case 10:
                aufd aufdVar = ((ury) obj).a;
                int i2 = aufdVar.c;
                if (i2 == 2) {
                    aufe aufeVar = i2 == 2 ? (aufe) aufdVar.d : aufe.a;
                    if ((aufeVar.b & 2) == 0) {
                        aldhVarA = aldh.XENO_EFFECT_RENDERING_LAYER_CAMERA_FOREGROUND;
                    } else {
                        ajhv ajhvVar = aufeVar.d;
                        if (ajhvVar == null) {
                            ajhvVar = ajhv.a;
                        }
                        int i3 = ajhvVar.b;
                        if (i3 == 5) {
                            aldhVarA = aldh.a((i3 == 5 ? (arlj) ajhvVar.c : arlj.a).g);
                            if (aldhVarA == null) {
                                aldhVarA = aldh.XENO_EFFECT_RENDERING_LAYER_UNKNOWN;
                            }
                            if (aldhVarA == aldh.XENO_EFFECT_RENDERING_LAYER_UNKNOWN) {
                                aldhVarA = aldh.XENO_EFFECT_RENDERING_LAYER_CAMERA_FOREGROUND;
                            }
                        } else {
                            aldhVarA = aldh.XENO_EFFECT_RENDERING_LAYER_CAMERA_FOREGROUND;
                        }
                    }
                } else {
                    aldhVarA = aldh.XENO_EFFECT_RENDERING_LAYER_CAMERA_FOREGROUND;
                }
                return aldhVarA.j;
            case 11:
                return ((augy) obj).g;
            case 12:
                return ((Integer) obj).intValue();
            case 13:
                throw null;
            case 14:
                return ((asku) obj).e;
            case 15:
                return ((asso) obj).c;
            case 16:
                return ((Integer) ((Map.Entry) obj).getValue()).intValue();
            case 17:
                return ((atyw) obj).b;
            case 18:
                return ((atyw) obj).c;
            case 19:
                return ((atyw) obj).d;
            default:
                return ((atyx) obj).b;
        }
    }
}
