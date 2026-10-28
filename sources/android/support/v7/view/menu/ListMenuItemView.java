package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import defpackage.ahto;
import defpackage.he;
import defpackage.iq;
import defpackage.is;
import defpackage.jc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, jc {
    public is a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private LayoutInflater q;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        ahto ahtoVarL = ahto.L(getContext(), attributeSet, he.r, i, 0);
        this.m = ahtoVarL.B(5);
        this.n = ahtoVarL.z(1, -1);
        this.c = ahtoVarL.G(7, false);
        this.o = context;
        this.p = ahtoVarL.B(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, com.google.android.apps.youtube.music.R.attr.dropDownListViewStyle, 0);
        this.d = typedArrayObtainStyledAttributes.hasValue(0);
        ahtoVarL.F();
        typedArrayObtainStyledAttributes.recycle();
    }

    private final LayoutInflater b() {
        LayoutInflater layoutInflater = this.q;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.q = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private final void c(View view, int i) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // defpackage.jc
    public final is a() {
        return this.a;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.b;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        rect.top += this.b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // defpackage.jc
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.support.v7.view.menu.ListMenuItemView, android.view.ViewGroup, jc] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.widget.CheckBox] */
    @Override // defpackage.jc
    public final void f(is isVar) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        ?? r5;
        ImageView imageView;
        String string;
        this.a = isVar;
        setVisibility(true != isVar.isVisible() ? 8 : 0);
        CharSequence charSequenceF = isVar.f(this);
        TextView textView = this.h;
        if (charSequenceF != null) {
            textView.setText(charSequenceF);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (textView.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean zIsCheckable = isVar.isCheckable();
        if (zIsCheckable || this.g != null || this.i != null) {
            if (this.a.p()) {
                if (this.g == null) {
                    RadioButton radioButton = (RadioButton) b().inflate(com.google.android.apps.youtube.music.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.g = radioButton;
                    c(radioButton, -1);
                }
                compoundButton = this.g;
                CheckBox checkBox = this.i;
                compoundButton2 = checkBox;
                r5 = checkBox;
            } else {
                if (this.i == null) {
                    CheckBox checkBox2 = (CheckBox) b().inflate(com.google.android.apps.youtube.music.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.i = checkBox2;
                    c(checkBox2, -1);
                }
                compoundButton = this.i;
                compoundButton2 = this.g;
                r5 = compoundButton;
            }
            if (zIsCheckable) {
                compoundButton.setChecked(this.a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                if (r5 != 0) {
                    r5.setVisibility(8);
                }
                RadioButton radioButton2 = this.g;
                if (radioButton2 != null) {
                    radioButton2.setVisibility(8);
                }
            }
        }
        boolean zT = isVar.t();
        isVar.e();
        int i = (zT && this.a.t()) ? 0 : 8;
        if (i == 0) {
            TextView textView2 = this.j;
            is isVar2 = this.a;
            char cE = isVar2.e();
            if (cE == 0) {
                string = "";
            } else {
                iq iqVar = isVar2.j;
                Context context = iqVar.a;
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(com.google.android.apps.youtube.music.R.string.abc_prepend_shortcut_label));
                }
                int i2 = iqVar.x() ? isVar2.i : isVar2.g;
                is.g(sb, i2, 65536, resources.getString(com.google.android.apps.youtube.music.R.string.abc_menu_meta_shortcut_label));
                is.g(sb, i2, SemanticState.Obscured, resources.getString(com.google.android.apps.youtube.music.R.string.abc_menu_ctrl_shortcut_label));
                is.g(sb, i2, 2, resources.getString(com.google.android.apps.youtube.music.R.string.abc_menu_alt_shortcut_label));
                is.g(sb, i2, 1, resources.getString(com.google.android.apps.youtube.music.R.string.abc_menu_shift_shortcut_label));
                is.g(sb, i2, 4, resources.getString(com.google.android.apps.youtube.music.R.string.abc_menu_sym_shortcut_label));
                is.g(sb, i2, 8, resources.getString(com.google.android.apps.youtube.music.R.string.abc_menu_function_shortcut_label));
                if (cE == '\b') {
                    sb.append(resources.getString(com.google.android.apps.youtube.music.R.string.abc_menu_delete_shortcut_label));
                } else if (cE == '\n') {
                    sb.append(resources.getString(com.google.android.apps.youtube.music.R.string.abc_menu_enter_shortcut_label));
                } else if (cE != ' ') {
                    sb.append(cE);
                } else {
                    sb.append(resources.getString(com.google.android.apps.youtube.music.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView2.setText(string);
        }
        if (this.j.getVisibility() != i) {
            this.j.setVisibility(i);
        }
        Drawable icon = isVar.getIcon();
        iq iqVar2 = this.a.j;
        boolean z = this.e;
        if ((z || this.c) && ((imageView = this.f) != null || icon != null || this.c)) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) b().inflate(com.google.android.apps.youtube.music.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f = imageView2;
                c(imageView2, 0);
            }
            if (icon != null || this.c) {
                ImageView imageView3 = this.f;
                if (true != z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
            } else {
                this.f.setVisibility(8);
            }
        }
        setEnabled(isVar.isEnabled());
        boolean zHasSubMenu = isVar.hasSubMenu();
        ImageView imageView4 = this.k;
        if (imageView4 != null) {
            imageView4.setVisibility(true != zHasSubMenu ? 8 : 0);
        }
        setContentDescription(isVar.l);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.m);
        TextView textView = (TextView) findViewById(com.google.android.apps.youtube.music.R.id.title);
        this.h = textView;
        int i = this.n;
        if (i != -1) {
            textView.setTextAppearance(this.o, i);
        }
        this.j = (TextView) findViewById(com.google.android.apps.youtube.music.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.google.android.apps.youtube.music.R.id.submenuarrow);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.b = (ImageView) findViewById(com.google.android.apps.youtube.music.R.id.group_divider);
        this.l = (LinearLayout) findViewById(com.google.android.apps.youtube.music.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f != null && this.c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.listMenuViewStyle);
    }
}
