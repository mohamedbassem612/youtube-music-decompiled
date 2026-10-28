package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adyg extends qnv {
    private final adky a;
    private adkz b;
    private final vxz c;
    private final vxz d;

    public adyg(Context context, adkz adkzVar, vxz vxzVar, vxz vxzVar2) {
        super(context);
        xbl xblVar = new xbl(this, 5);
        this.a = xblVar;
        this.b = adle.a;
        this.c = vxzVar;
        this.d = vxzVar2;
        adkzVar.getClass();
        this.b.n(xblVar);
        this.b = adkzVar;
        adkzVar.h(xblVar);
        notifyDataSetChanged();
    }

    @Override // defpackage.qnv
    protected final Object a(int i, View view) {
        qnx item = getItem(i);
        if (!(item instanceof adyj)) {
            if (item instanceof adyh) {
                return view;
            }
            if (item instanceof qnz) {
                return null;
            }
            return super.a(i, view);
        }
        if (i == 0) {
            view.setLayoutDirection(getContext().getResources().getConfiguration().getLayoutDirection());
        }
        vxz vxzVar = this.d;
        boolean z = false;
        if (vxzVar != null && vxzVar.l(104, 45718582L, false)) {
            z = true;
        }
        return new adyf(view, z);
    }

    @Override // defpackage.qnv
    protected final void b(int i, Object obj) {
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        ColorStateList colorStateListK;
        qnx item = getItem(i);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.bottom_sheet_list_item_height);
        if (item instanceof adyj) {
            adyj adyjVar = (adyj) item;
            if (obj instanceof adyf) {
                adyf adyfVar = (adyf) obj;
                vxz vxzVar = this.c;
                vxz vxzVar2 = this.d;
                adyjVar.l = vxzVar != null && vxzVar.l(123, 45629879L, false);
                adyjVar.m = vxzVar2 != null && vxzVar2.l(104, 45718582L, false);
                TextView textView = adyfVar.a;
                if (textView != null) {
                    textView.setText(adyjVar.d);
                    if (adyjVar.c()) {
                        colorStateListK = adyjVar.e;
                        if (colorStateListK == null) {
                            colorStateListK = tzk.k(textView.getContext(), R.attr.ytTextPrimary);
                        }
                    } else {
                        colorStateListK = tzk.k(textView.getContext(), R.attr.ytTextDisabled);
                    }
                    textView.setTextColor(colorStateListK);
                }
                View view = adyfVar.i;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (vxzVar2 != null && vxzVar2.l(190, 45851384L, false)) {
                        if (layoutParams2 == null) {
                            layoutParams2 = new AbsListView.LayoutParams(-1, -2);
                        }
                        layoutParams2.height = -2;
                        view.setMinimumHeight(true != adyjVar.m ? dimensionPixelSize : 0);
                        view.setLayoutParams(layoutParams2);
                    } else if (layoutParams2 != null) {
                        layoutParams2.height = -2;
                        if (adyjVar.m) {
                            view.setMinimumHeight(0);
                        } else {
                            view.setMinimumHeight(dimensionPixelSize);
                        }
                        view.setLayoutParams(layoutParams2);
                    }
                }
                if (textView != null && (layoutParams = textView.getLayoutParams()) != null) {
                    layoutParams.height = -2;
                    textView.setMinimumHeight(dimensionPixelSize);
                    textView.setLayoutParams(layoutParams);
                }
                ProgressBar progressBar = adyfVar.f;
                if (progressBar != null) {
                    progressBar.setVisibility(((adyjVar instanceof adyl) && ((adyl) adyjVar).r) ? 0 : 8);
                }
                if (adyjVar.m && (frameLayout = adyfVar.g) != null) {
                    if (adyjVar.f == null) {
                        frameLayout.setVisibility(8);
                    } else {
                        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                        if (layoutParams3 != null && textView != null) {
                            layoutParams3.width = textView.getContext().getResources().getDimensionPixelSize(R.dimen.bottom_sheet_list_icon_size);
                            layoutParams3.height = layoutParams3.width;
                        }
                        frameLayout.setVisibility(0);
                    }
                }
                ImageView imageView = adyfVar.b;
                if (imageView != null) {
                    Drawable drawable = adyjVar.f;
                    if (drawable == null) {
                        imageView.setVisibility(8);
                    } else {
                        imageView.setImageDrawable(drawable);
                        imageView.setVisibility(0);
                        if (adyjVar.j) {
                            imageView.setImageTintList(tzk.k(imageView.getContext(), true != adyjVar.c() ? R.attr.ytIconDisabled : R.attr.ytTextPrimary));
                        } else {
                            imageView.setImageTintList(null);
                        }
                    }
                }
                if (adyjVar.m) {
                    View view2 = adyfVar.h;
                    if (view2 != null) {
                        ae aeVar = (ae) view2.getLayoutParams();
                        if (aeVar != null) {
                            if (adyjVar.g == null && adyjVar.f == null && adyjVar.h == null) {
                                aeVar.n = 0;
                                aeVar.p = 0;
                            } else {
                                aeVar.n = -1;
                                aeVar.p = -1;
                            }
                            view2.setLayoutParams(aeVar);
                        }
                        textView.setPaddingRelative(0, 0, 0, 0);
                    }
                } else {
                    TextView textView2 = adyfVar.c;
                    TextView textView3 = adyfVar.d;
                    if (textView2 != null && textView3 != null) {
                        String str = adyjVar.b;
                        if (str == null) {
                            textView2.setVisibility(8);
                            textView3.setVisibility(8);
                        } else {
                            textView2.setText(str);
                            textView2.setVisibility(0);
                            textView3.setText("•");
                            textView3.setVisibility(0);
                            ColorStateList colorStateListK2 = tzk.k(textView2.getContext(), true != adyjVar.c() ? R.attr.ytTextDisabled : R.attr.ytTextSecondary);
                            textView2.setTextColor(colorStateListK2);
                            textView3.setTextColor(colorStateListK2);
                        }
                    }
                }
                ImageView imageView2 = adyfVar.e;
                if (imageView2 != null) {
                    Drawable drawable2 = adyjVar.g;
                    if (drawable2 == null) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setImageDrawable(drawable2);
                        imageView2.setVisibility(0);
                        if (adyjVar.i) {
                            imageView2.setImageTintList(tzk.k(imageView2.getContext(), true != adyjVar.c() ? R.attr.ytIconDisabled : R.attr.ytTextPrimary));
                        } else {
                            imageView2.setImageTintList(null);
                        }
                    }
                }
                if (view != null) {
                    view.setBackgroundColor(0);
                    return;
                }
                return;
            }
        }
        if (item instanceof adyh) {
            if (obj instanceof ViewGroup) {
                throw null;
            }
        }
        if (item instanceof qnz) {
            return;
        }
        super.b(i, obj);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final qnx getItem(int i) {
        Object objD = this.b.d(i);
        if (!(objD instanceof qnx)) {
            return new qnz();
        }
        qnx qnxVar = (qnx) objD;
        if (!(qnxVar instanceof adyj)) {
            return qnxVar;
        }
        adyj adyjVar = (adyj) qnxVar;
        vxz vxzVar = this.d;
        if (vxzVar == null || !vxzVar.l(104, 45718582L, false)) {
            return qnxVar;
        }
        adyjVar.m = true;
        return qnxVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.b.a();
    }

    @Override // defpackage.qnv, android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object objD = this.b.d(i);
        if (objD instanceof adyj) {
            return 4;
        }
        if (objD instanceof qny) {
            return 0;
        }
        if (!(objD instanceof qnz)) {
            if (objD instanceof adyh) {
                return 2;
            }
            if (objD instanceof qnx) {
                return 3;
            }
        }
        return 1;
    }

    @Override // defpackage.qnv, android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 5;
    }
}
