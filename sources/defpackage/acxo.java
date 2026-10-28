package defpackage;

import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.blocks.runtime.ClientCreator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acxo implements ClientCreator {
    final /* synthetic */ int a;

    public acxo(int i) {
        this.a = i;
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final /* bridge */ /* synthetic */ String b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.blocks.runtime.BaseClientCreator
    public final /* bridge */ /* synthetic */ BaseClient c(long j) {
        return new acxp(j, this.a);
    }
}
