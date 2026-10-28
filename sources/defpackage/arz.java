package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class arz extends View {
    public int[] c;
    public int d;
    protected final Context e;
    public String f;
    protected String g;
    public final HashMap h;
    public arh i;

    public arz(Context context) {
        super(context);
        this.c = new int[32];
        this.h = new HashMap();
        this.e = context;
        a(null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    private final void c(String str) {
        int iD;
        if (str == null || str.length() == 0 || this.e == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int identifier = 0;
        if (!isInEditMode() || constraintLayout == null) {
            iD = 0;
        } else {
            Object objD = constraintLayout.d(strTrim);
            if (objD instanceof Integer) {
                iD = ((Integer) objD).intValue();
            } else {
                iD = 0;
            }
        }
        if (iD == 0) {
            iD = constraintLayout != null ? d(constraintLayout, strTrim) : 0;
        }
        if (iD == 0) {
            try {
                identifier = aso.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        } else {
            identifier = iD;
        }
        if (identifier == 0) {
            Context context = this.e;
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier == 0) {
            Log.w("ConstraintHelper", a.bU((byte) 34, strTrim, "Could not find id of \""));
        } else {
            this.h.put(Integer.valueOf(identifier), strTrim);
            i(identifier);
        }
    }

    private final void i(int i) {
        if (i != getId()) {
            int i2 = this.d + 1;
            int[] iArrCopyOf = this.c;
            int length = iArrCopyOf.length;
            if (i2 > length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, length << 1);
                this.c = iArrCopyOf;
            }
            int i3 = this.d;
            iArrCopyOf[i3] = i;
            this.d = i3 + 1;
        }
    }

    private final void j(String str) {
        if (str == null || str.length() == 0 || this.e == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof asb) && strTrim.equals(((asb) layoutParams).ac)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    i(childAt.getId());
                }
            }
        }
    }

    protected void a(AttributeSet attributeSet) {
        throw null;
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || (resources = this.e.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final void e(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.d = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    protected final void f(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.d = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                j(str.substring(i));
                return;
            } else {
                j(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public final void g(int[] iArr) {
        this.f = null;
        this.d = 0;
        for (int i : iArr) {
            i(i);
        }
    }

    public final void h() {
        if (this.i != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof asb) {
                ((asb) layoutParams).av = this.i;
            }
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            e(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            f(str2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            i(i);
        }
    }

    public arz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new int[32];
        this.h = new HashMap();
        this.e = context;
        a(attributeSet);
    }

    public arz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new int[32];
        this.h = new HashMap();
        this.e = context;
        a(attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void b(ard ardVar, boolean z) {
    }
}
