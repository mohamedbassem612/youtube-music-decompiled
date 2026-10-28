package defpackage;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.JSBlocksContainerProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class adbh extends JSBlocksContainerProvider {
    final /* synthetic */ awmd a;

    public adbh(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSBlocksContainerProvider
    public final Container getBlocksContainer() {
        return (Container) this.a.io();
    }
}
