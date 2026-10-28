package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController$RecycleListView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class fv extends gr implements DialogInterface {
    public final ft a;

    protected fv(Context context, int i) {
        super(context, a(context, i));
        this.a = new ft(getContext(), this, getWindow());
    }

    static int a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button b(int i) {
        ft ftVar = this.a;
        if (i != -3) {
            return i != -2 ? ftVar.j : ftVar.m;
        }
        return ftVar.p;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x019b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x019d  */
    @Override // defpackage.gr, defpackage.qg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        int i;
        View viewFindViewById;
        ListAdapter listAdapter;
        int i2;
        View viewFindViewById2;
        super.onCreate(bundle);
        ft ftVar = this.a;
        int i3 = ftVar.B;
        ftVar.b.setContentView(ftVar.A);
        Window window = ftVar.c;
        View viewFindViewById3 = window.findViewById(R.id.parentPanel);
        View viewFindViewById4 = viewFindViewById3.findViewById(R.id.topPanel);
        View viewFindViewById5 = viewFindViewById3.findViewById(R.id.contentPanel);
        View viewFindViewById6 = viewFindViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(R.id.customPanel);
        View viewInflate = ftVar.g;
        if (viewInflate == null) {
            viewInflate = ftVar.h != 0 ? LayoutInflater.from(ftVar.a).inflate(ftVar.h, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (z && ft.b(viewInflate)) {
            ((FrameLayout) window.findViewById(R.id.custom)).addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            boolean z2 = ftVar.i;
            if (ftVar.f != null) {
                ((mo) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            window.setFlags(131072, 131072);
            if (z) {
                ((FrameLayout) window.findViewById(R.id.custom)).addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
                boolean z3 = ftVar.i;
                if (ftVar.f != null) {
                    ((mo) viewGroup.getLayoutParams()).weight = 0.0f;
                }
            } else {
                viewGroup.setVisibility(8);
            }
        }
        View viewFindViewById7 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupD = ft.d(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupD2 = ft.d(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupD3 = ft.d(viewFindViewById9, viewFindViewById6);
        ftVar.r = (NestedScrollView) window.findViewById(R.id.scrollView);
        ftVar.r.setFocusable(false);
        ftVar.r.setNestedScrollingEnabled(false);
        ftVar.w = (TextView) viewGroupD2.findViewById(android.R.id.message);
        TextView textView = ftVar.w;
        if (textView != null) {
            CharSequence charSequence = ftVar.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                ftVar.r.removeView(ftVar.w);
                if (ftVar.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) ftVar.r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(ftVar.r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(ftVar.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupD2.setVisibility(8);
                }
            }
        }
        ftVar.j = (Button) viewGroupD3.findViewById(android.R.id.button1);
        Button button = ftVar.j;
        View.OnClickListener onClickListener = ftVar.I;
        button.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(ftVar.k)) {
            ftVar.j.setVisibility(8);
            i = 0;
        } else {
            ftVar.j.setText(ftVar.k);
            ftVar.j.setVisibility(0);
            i = 1;
        }
        ftVar.m = (Button) viewGroupD3.findViewById(android.R.id.button2);
        ftVar.m.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(ftVar.n)) {
            ftVar.m.setVisibility(8);
        } else {
            ftVar.m.setText(ftVar.n);
            ftVar.m.setVisibility(0);
            i |= 2;
        }
        ftVar.p = (Button) viewGroupD3.findViewById(android.R.id.button3);
        ftVar.p.setOnClickListener(onClickListener);
        CharSequence charSequence2 = ftVar.q;
        ftVar.p.setVisibility(8);
        Context context = ftVar.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            if (i == 0) {
                viewGroupD3.setVisibility(8);
            }
        } else if (i == 1) {
            ft.c(ftVar.j);
        } else if (i == 2) {
            ft.c(ftVar.m);
        } else if (i == 4) {
            ft.c(ftVar.p);
        } else if (i == 0) {
            viewGroupD3.setVisibility(8);
        }
        if (ftVar.x != null) {
            viewGroupD.addView(ftVar.x, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            ftVar.u = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(ftVar.d) || !ftVar.G) {
                window.findViewById(R.id.title_template).setVisibility(8);
                ftVar.u.setVisibility(8);
                viewGroupD.setVisibility(8);
            } else {
                ftVar.v = (TextView) window.findViewById(R.id.alertTitle);
                ftVar.v.setText(ftVar.d);
                int i4 = ftVar.s;
                Drawable drawable = ftVar.t;
                if (drawable != null) {
                    ftVar.u.setImageDrawable(drawable);
                } else {
                    ftVar.v.setPadding(ftVar.u.getPaddingLeft(), ftVar.u.getPaddingTop(), ftVar.u.getPaddingRight(), ftVar.u.getPaddingBottom());
                    ftVar.u.setVisibility(8);
                }
            }
        }
        boolean z4 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        int i5 = (viewGroupD == null || viewGroupD.getVisibility() == 8) ? 0 : 1;
        boolean z5 = (viewGroupD3 == null || viewGroupD3.getVisibility() == 8) ? false : true;
        if (!z5 && viewGroupD2 != null && (viewFindViewById2 = viewGroupD2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView = ftVar.r;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (ftVar.e == null && ftVar.f == null) ? null : viewGroupD.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupD2 != null && (viewFindViewById = viewGroupD2.findViewById(R.id.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = ftVar.f;
        if (listView instanceof AlertController$RecycleListView) {
            if (!z5) {
                i2 = i5;
            } else if (i5 == 0) {
                i2 = 0;
            }
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) listView;
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z5 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z4) {
            View view = ftVar.f;
            if (view == null) {
                view = ftVar.r;
            }
            if (view != null) {
                int i6 = true == z5 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                int i7 = bac.a;
                view.setScrollIndicators(i5 | i6, 3);
                if (viewFindViewById11 != null) {
                    viewGroupD2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupD2.removeView(viewFindViewById12);
                }
            }
        }
        ListView listView2 = ftVar.f;
        if (listView2 == null || (listAdapter = ftVar.y) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i8 = ftVar.z;
        if (i8 >= 0) {
            listView2.setItemChecked(i8, true);
            listView2.setSelection(i8);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.r;
        if (nestedScrollView == null || !nestedScrollView.o(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.r;
        if (nestedScrollView == null || !nestedScrollView.o(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.gr, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }
}
