package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class her extends vwi {
    @Override // defpackage.vwi
    protected final /* bridge */ /* synthetic */ int a(MessageLite messageLite) {
        amzv amzvVar = (amzv) messageLite;
        if ((amzvVar.b & 16) == 0) {
            return 0;
        }
        amzl amzlVar = amzvVar.h;
        if (amzlVar == null) {
            amzlVar = amzl.a;
        }
        return amzlVar.c;
    }

    @Override // defpackage.vwi
    protected final /* bridge */ /* synthetic */ int b(MessageLite messageLite) {
        amzv amzvVar = (amzv) messageLite;
        if ((amzvVar.b & 16) == 0) {
            return 0;
        }
        amzl amzlVar = amzvVar.h;
        if (amzlVar == null) {
            amzlVar = amzl.a;
        }
        return amzlVar.d;
    }

    @Override // defpackage.vwi
    protected final /* synthetic */ MessageLite c() {
        return amzv.a;
    }

    @Override // defpackage.vwi
    protected final /* synthetic */ alop d(MessageLite messageLite) {
        alop alopVar = ((amzv) messageLite).c;
        return alopVar == null ? alop.a : alopVar;
    }
}
