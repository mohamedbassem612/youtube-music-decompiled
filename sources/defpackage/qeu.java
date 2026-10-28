package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qeu extends qex {
    public static final qeu a = new qeu();

    @Override // defpackage.qex
    public final /* bridge */ /* synthetic */ MessageLite a(String str, Object obj) {
        int iIntValue = ((Long) obj).intValue();
        if (iIntValue == 0) {
            return null;
        }
        aihf aihfVarCreateBuilder = axfx.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        axfx axfxVar = (axfx) aihfVarCreateBuilder.instance;
        axfxVar.b |= 1;
        axfxVar.c = iIntValue;
        if (str != null) {
            axfy axfyVarV = qnl.v(str);
            aihfVarCreateBuilder.copyOnWrite();
            axfx axfxVar2 = (axfx) aihfVarCreateBuilder.instance;
            axfyVarV.getClass();
            axfxVar2.d = axfyVarV;
            axfxVar2.b |= 2;
        }
        return (axfx) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.qex
    public final /* synthetic */ MessageLite b(MessageLite messageLite, MessageLite messageLite2) {
        int i;
        axfx axfxVar = (axfx) messageLite;
        axfx axfxVar2 = (axfx) messageLite2;
        if (axfxVar == null || axfxVar2 == null) {
            return axfxVar;
        }
        if ((axfxVar.b & 1) == 0 || (i = axfxVar.c - axfxVar2.c) == 0) {
            return null;
        }
        aihf aihfVarCreateBuilder = axfx.a.createBuilder();
        if ((axfxVar.b & 2) != 0) {
            axfy axfyVar = axfxVar.d;
            if (axfyVar == null) {
                axfyVar = axfy.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            axfx axfxVar3 = (axfx) aihfVarCreateBuilder.instance;
            axfyVar.getClass();
            axfxVar3.d = axfyVar;
            axfxVar3.b |= 2;
        }
        aihfVarCreateBuilder.copyOnWrite();
        axfx axfxVar4 = (axfx) aihfVarCreateBuilder.instance;
        axfxVar4.b |= 1;
        axfxVar4.c = i;
        return (axfx) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.qex
    public final /* bridge */ /* synthetic */ String c(MessageLite messageLite) {
        axfy axfyVar = ((axfx) messageLite).d;
        if (axfyVar == null) {
            axfyVar = axfy.a;
        }
        return axfyVar.d;
    }
}
