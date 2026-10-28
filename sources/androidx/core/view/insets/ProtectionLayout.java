package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.acik;
import defpackage.bcr;
import defpackage.bcv;
import defpackage.mc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object a = new Object();
    private final List b;
    private acik c;

    public ProtectionLayout(Context context, List list) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }

    private final void a() {
        bcv bcvVar;
        List list = this.b;
        if (list.isEmpty()) {
            b();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof bcv) {
            bcvVar = (bcv) tag;
        } else {
            bcvVar = new bcv(viewGroup);
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, bcvVar);
        }
        b();
        this.c = new acik(bcvVar, list);
        getChildCount();
        if (this.c.a() > 0) {
            this.c.d();
            getContext();
            throw null;
        }
    }

    private final void b() {
        if (this.c != null) {
            removeViews(getChildCount() - this.c.a(), this.c.a());
            int iA = this.c.a();
            acik acikVar = this.c;
            if (iA > 0) {
                acikVar.d();
                throw null;
            }
            if (!acikVar.a) {
                acikVar.a = true;
                ((bcv) acikVar.c).b.remove(acikVar);
                ArrayList arrayList = (ArrayList) acikVar.d;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        ((bcr) arrayList.get(size)).b = null;
                    }
                }
                arrayList.clear();
            }
            this.c = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != a) {
            acik acikVar = this.c;
            int childCount = getChildCount() - (acikVar != null ? acikVar.a() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof bcv) {
            bcv bcvVar = (bcv) tag;
            if (bcvVar.b.isEmpty()) {
                bcvVar.a.post(new mc(bcvVar, 20, null));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new ArrayList();
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.b = new ArrayList();
    }
}
