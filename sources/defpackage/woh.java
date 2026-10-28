package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class woh extends vwi {
    @Override // defpackage.vwi
    protected final /* synthetic */ int a(MessageLite messageLite) {
        return ((almd) messageLite).o;
    }

    @Override // defpackage.vwi
    protected final /* synthetic */ int b(MessageLite messageLite) {
        return ((almd) messageLite).p;
    }

    @Override // defpackage.vwi
    protected final /* synthetic */ MessageLite c() {
        return almd.a;
    }

    @Override // defpackage.vwi
    protected final /* synthetic */ alop d(MessageLite messageLite) {
        alop alopVar = ((almd) messageLite).c;
        return alopVar == null ? alop.a : alopVar;
    }
}
