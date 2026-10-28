package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixx extends ixz {
    public SwipeRefreshLayout a;
    public View b;
    public advm c;
    public ixy d;
    public View.OnClickListener e;
    final /* synthetic */ LoadingFrameLayout f;
    private View j;
    private View k;
    private View l;
    private ImageView m;
    private TextView n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private CharSequence s;
    private boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixx(LoadingFrameLayout loadingFrameLayout, int i) {
        super(loadingFrameLayout, 4, i, R.id.error_message_text);
        this.f = loadingFrameLayout;
    }

    @Override // defpackage.ixz
    protected final View a() {
        View viewA = super.a();
        this.a = (SwipeRefreshLayout) viewA.findViewById(R.id.error_swipe_to_retry_layout);
        this.l = viewA.findViewById(R.id.error_message);
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.a = new ixw(this, 0);
        }
        this.m = (ImageView) viewA.findViewById(R.id.loading_error_icon);
        b(this.r);
        this.n = (TextView) viewA.findViewById(R.id.error_title);
        g(this.s);
        View viewFindViewById = viewA.findViewById(R.id.learn_more_button);
        this.b = viewFindViewById;
        if (viewFindViewById != null) {
            LoadingFrameLayout loadingFrameLayout = this.f;
            loadingFrameLayout.f.a(viewFindViewById, null, new iks(3), null, false).i(loadingFrameLayout.getContext().getString(R.string.learn_more), 41, 2);
            this.b.setOnClickListener(this.e);
        }
        d(this.t);
        View viewFindViewById2 = viewA.findViewById(R.id.error_retry_button);
        this.j = viewFindViewById2;
        if (viewFindViewById2 != null) {
            LoadingFrameLayout loadingFrameLayout2 = this.f;
            loadingFrameLayout2.f.a(viewFindViewById2, null, new ivp(this, 5), null, false).i(loadingFrameLayout2.getContext().getString(R.string.offline_error_try_again), 41, 2);
        }
        e(this.o);
        View viewFindViewById3 = viewA.findViewById(R.id.show_downloads_button);
        this.k = viewFindViewById3;
        if (viewFindViewById3 != null) {
            LoadingFrameLayout loadingFrameLayout3 = this.f;
            loadingFrameLayout3.f.a(viewFindViewById3, null, new ivp(this, 6), null, false).i(loadingFrameLayout3.getContext().getString(R.string.go_to_downloads), 27, 2);
        }
        f(this.p);
        c(this.q);
        return viewA;
    }

    public final void b(int i) {
        if (i != 0) {
            ImageView imageView = this.m;
            if (imageView != null) {
                imageView.setImageResource(i);
            } else {
                this.r = i;
            }
        }
    }

    public final void c(boolean z) {
        View view = this.l;
        if (view == null) {
            this.q = z;
        } else {
            view.setBackground(z ? this.f.a.getDrawable(R.drawable.loading_status_error_view_background) : null);
        }
    }

    public final void d(boolean z) {
        View view = this.b;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        } else {
            this.t = z;
        }
    }

    public final void e(boolean z) {
        View view = this.j;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        } else if (this.a == null) {
            this.o = z;
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(z);
        }
    }

    public final void f(boolean z) {
        View view = this.k;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        } else {
            this.p = z;
        }
    }

    public final void g(CharSequence charSequence) {
        TextView textView = this.n;
        if (textView != null) {
            textView.setVisibility(charSequence != null ? 0 : 8);
            this.n.setText(charSequence);
            charSequence = null;
        }
        this.s = charSequence;
    }
}
