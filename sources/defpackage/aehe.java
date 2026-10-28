package defpackage;

import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aehe {
    public final aehi a;
    public final LoadingFrameLayout b;
    public final xgn c;
    public final xir d;

    public aehe(aehi aehiVar, LoadingFrameLayout loadingFrameLayout, xgn xgnVar, xir xirVar) {
        this.a = aehiVar;
        this.b = loadingFrameLayout;
        this.c = xgnVar;
        this.d = xirVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aehe) {
            aehe aeheVar = (aehe) obj;
            aehi aehiVar = this.a;
            if (aehiVar != null ? aehiVar.equals(aeheVar.a) : aeheVar.a == null) {
                LoadingFrameLayout loadingFrameLayout = this.b;
                if (loadingFrameLayout != null ? loadingFrameLayout.equals(aeheVar.b) : aeheVar.b == null) {
                    xgn xgnVar = this.c;
                    if (xgnVar != null ? xgnVar.equals(aeheVar.c) : aeheVar.c == null) {
                        xir xirVar = this.d;
                        if (xirVar == null) {
                            if (aeheVar.d == null) {
                                return true;
                            }
                        } else if (xirVar.equals(aeheVar.d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        aehi aehiVar = this.a;
        int iHashCode = aehiVar == null ? 0 : aehiVar.hashCode();
        LoadingFrameLayout loadingFrameLayout = this.b;
        int iHashCode2 = (((iHashCode ^ 1000003) * 1525764945) ^ (loadingFrameLayout == null ? 0 : loadingFrameLayout.hashCode())) * 1000003;
        xgn xgnVar = this.c;
        int iHashCode3 = iHashCode2 ^ (xgnVar == null ? 0 : xgnVar.hashCode());
        xir xirVar = this.d;
        return ((iHashCode3 * (-721379959)) ^ (xirVar != null ? xirVar.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        xir xirVar = this.d;
        xgn xgnVar = this.c;
        LoadingFrameLayout loadingFrameLayout = this.b;
        return "WebViewOptions{webViewDelegate=" + String.valueOf(this.a) + ", loadingViewGroup=null, elementPresenter=null, elementsTransformer=null, loadingFrameLayout=" + String.valueOf(loadingFrameLayout) + ", interactionLogger=" + String.valueOf(xgnVar) + ", interactionLoggingClientData=null, latencyActionLogger=" + String.valueOf(xirVar) + ", lifecycle=null}";
    }

    public aehe() {
        throw null;
    }
}
