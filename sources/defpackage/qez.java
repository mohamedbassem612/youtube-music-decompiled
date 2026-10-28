package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qez extends qex {
    public static final qez a = new qez();

    @Override // defpackage.qex
    public final /* synthetic */ MessageLite a(String str, Object obj) {
        return qnl.y(str, ie$$ExternalSyntheticApiModelOutline0.m827m(obj));
    }

    @Override // defpackage.qex
    public final /* synthetic */ MessageLite b(MessageLite messageLite, MessageLite messageLite2) {
        return qnl.x((axgd) messageLite, (axgd) messageLite2);
    }

    @Override // defpackage.qex
    public final /* bridge */ /* synthetic */ String c(MessageLite messageLite) {
        axgd axgdVar = (axgd) messageLite;
        axfy axfyVar = axgdVar.e;
        if (axfyVar == null) {
            axfyVar = axfy.a;
        }
        if ((axfyVar.b & 2) != 0) {
            axfy axfyVar2 = axgdVar.e;
            if (axfyVar2 == null) {
                axfyVar2 = axfy.a;
            }
            return axfyVar2.d;
        }
        axfy axfyVar3 = axgdVar.e;
        if (axfyVar3 == null) {
            axfyVar3 = axfy.a;
        }
        return Long.toHexString(axfyVar3.c);
    }
}
