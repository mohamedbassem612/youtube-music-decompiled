package defpackage;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class advk extends adty {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    public advk(wnf wnfVar, advb advbVar, tbt tbtVar, ttm ttmVar, xgn xgnVar, amgb amgbVar, vxz vxzVar) {
        alay alayVar;
        MessageLite messageLite;
        super(wnfVar, tbtVar, ttmVar, xgnVar, vxzVar);
        advbVar.b(amgb.class);
        Object aecmVar = new aecm();
        if ((amgbVar.b & 16) != 0) {
            alayVar = amgbVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        ackj.k(null, alayVar, null, false).getClass();
        E(aecmVar);
        if (amgbVar != null) {
            aiie<amga> aiieVar = amgbVar.c;
            ArrayList arrayList = new ArrayList(aiieVar.size());
            for (amga amgaVar : aiieVar) {
                if (amgaVar != null) {
                    int i = amgaVar.b;
                    if ((i & 1) != 0) {
                        messageLite = amgaVar.c;
                        if (messageLite == null) {
                            messageLite = akci.a;
                        }
                    } else if ((i & 2) != 0) {
                        messageLite = amgaVar.d;
                        if (messageLite == null) {
                            messageLite = akbq.a;
                        }
                    } else if ((i & 4) != 0) {
                        messageLite = amgaVar.e;
                        if (messageLite == null) {
                            messageLite = akbs.a;
                        }
                    } else if ((i & 8) != 0) {
                        messageLite = amgaVar.f;
                        if (messageLite == null) {
                            messageLite = akbt.a;
                        }
                    } else if ((i & 16) != 0) {
                        messageLite = amgaVar.g;
                        if (messageLite == null) {
                            messageLite = akbv.a;
                        }
                    } else if ((i & 32) != 0) {
                        messageLite = amgaVar.h;
                        if (messageLite == null) {
                            messageLite = akbw.a;
                        }
                    } else if ((i & 64) != 0) {
                        messageLite = amgaVar.i;
                        if (messageLite == null) {
                            messageLite = akay.a;
                        }
                    } else {
                        messageLite = null;
                    }
                } else {
                    messageLite = null;
                }
                if (messageLite != null) {
                    arrayList.add(messageLite);
                }
            }
            G(arrayList);
        }
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ Object c(apjh apjhVar) {
        return apjhVar;
    }
}
