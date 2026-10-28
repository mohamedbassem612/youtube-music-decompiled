package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class woa extends wnl {
    final /* synthetic */ aaqf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woa(aaqf aaqfVar, wlp wlpVar) {
        super(wlpVar, aaqfVar.e(), allc.a, new heo(10), new hep(5));
        this.a = aaqfVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, mbc] */
    @Override // defpackage.wnl
    public final /* bridge */ /* synthetic */ Object h(MessageLite messageLite) {
        return new wgk((allc) messageLite, this.a.c.b());
    }
}
