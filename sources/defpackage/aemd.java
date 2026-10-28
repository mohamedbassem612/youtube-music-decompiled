package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aemd extends LinearLayoutManager {
    final /* synthetic */ aemn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemd(aemn aemnVar, Context context) {
        super(context);
        this.a = aemnVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final boolean canScrollVertically() {
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = this.a.p;
        return anchorableTopPeekingScrollView.n || anchorableTopPeekingScrollView.getScrollY() == anchorableTopPeekingScrollView.k;
    }
}
