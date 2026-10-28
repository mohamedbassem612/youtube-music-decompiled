package defpackage;

import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aewp {
    public static int A(int i) {
        if (i == 1000) {
            return 1001;
        }
        if (i == 1001) {
            return 1002;
        }
        if (i == 10001) {
            return 10002;
        }
        if (i == 10002) {
            return 10003;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static final /* synthetic */ ahzy B(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ahzy) aihnVarBuild;
    }

    public static final /* synthetic */ ahzr C(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ahzr) aihnVarBuild;
    }

    public static final void D(ahyo ahyoVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahzr ahzrVar = (ahzr) aihfVar.instance;
        ahzr ahzrVar2 = ahzr.a;
        ahzrVar.d = ahyoVar;
        ahzrVar.b |= 2;
    }

    public static final void E(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahzr ahzrVar = (ahzr) aihfVar.instance;
        ahzr ahzrVar2 = ahzr.a;
        ahzrVar.b |= 8;
        ahzrVar.e = str;
    }

    public static final void F(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahzr ahzrVar = (ahzr) aihfVar.instance;
        ahzr ahzrVar2 = ahzr.a;
        ahzrVar.c = 3;
        ahzrVar.b |= 1;
    }

    public static final /* synthetic */ ahzo G(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ahzo) aihnVarBuild;
    }

    public static final void H(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahzo ahzoVar = (ahzo) aihfVar.instance;
        ahzo ahzoVar2 = ahzo.a;
        ahzoVar.c = i - 1;
        ahzoVar.b |= 1;
    }

    public static final void I(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahzj ahzjVar = (ahzj) aihfVar.instance;
        ahzj ahzjVar2 = ahzj.a;
        ahzjVar.b |= 16;
        ahzjVar.i = j;
    }

    public static final void J(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahzj ahzjVar = (ahzj) aihfVar.instance;
        ahzj ahzjVar2 = ahzj.a;
        ahzjVar.b |= 8;
        ahzjVar.h = j;
    }

    public static final /* synthetic */ ahzk K(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ahzk) aihnVarBuild;
    }

    public static final void L(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahzk ahzkVar = (ahzk) aihfVar.instance;
        ahzk ahzkVar2 = ahzk.a;
        ahzkVar.b |= 1;
        ahzkVar.c = i;
    }

    public static final /* synthetic */ axst M(aihf aihfVar) {
        aihfVar.getClass();
        return new axst(aihfVar);
    }

    public static final /* synthetic */ axst N(aihf aihfVar) {
        aihfVar.getClass();
        return new axst(aihfVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awqg, java.lang.Object] */
    public static final void O(ahub ahubVar, awqg awqgVar) {
        ahubVar.a.invoke(new avgj(awqgVar));
    }

    public static final omj P(Context context, ayq ayqVar) {
        context.getClass();
        ayqVar.getClass();
        syn synVar = afnp.m;
        String strL = qnl.l(context);
        strL.getClass();
        return ayqVar.ag("StartupAfterPackageReplacedImplDatabase_".concat(new awtk("[^A-Za-z0-9\\-_:]").a(strL, "_")), afnp.m);
    }

    public static final /* synthetic */ ahub Q(aihf aihfVar) {
        aihfVar.getClass();
        return new ahub(aihfVar);
    }

    public static final /* synthetic */ ahub R(aihf aihfVar) {
        aihfVar.getClass();
        return new ahub(aihfVar);
    }

    public static final /* synthetic */ ahub S(aihf aihfVar) {
        aihfVar.getClass();
        return new ahub(aihfVar);
    }

    private static int[] T(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int length2 = drawableState2.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, length + length2);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, length2);
        return iArrCopyOf;
    }

    private static void U(CheckableImageButton checkableImageButton) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        checkableImageButton.setFocusable(zHasOnClickListeners);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.c = zHasOnClickListeners;
        checkableImageButton.setLongClickable(false);
        checkableImageButton.setImportantForAccessibility(true != zHasOnClickListeners ? 2 : 1);
    }

    private static Context V(Context context, Class... clsArr) {
        loop0: while (context instanceof ContextWrapper) {
            for (Class cls : clsArr) {
                if (cls.isInstance(context)) {
                    break loop0;
                }
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static void a(Outline outline, Path path) {
        outline.setPath(path);
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        return (str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            obj.close();
        } else if (obj instanceof ExecutorService) {
            a.ar((ExecutorService) obj);
        } else {
            if (!(obj instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) obj).release();
        }
    }

    public static ImageView.ScaleType d(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i != 5) {
            return i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static void e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(T(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void f(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(T(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void g(CheckableImageButton checkableImageButton, int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    public static void h(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        U(checkableImageButton);
    }

    public static void i(CheckableImageButton checkableImageButton) {
        checkableImageButton.setOnLongClickListener(null);
        U(checkableImageButton);
    }

    public static void j(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (true != checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static final awou k() {
        return new afwr(new ahno(), false, true);
    }

    public static final awut l(awou awouVar, boc bocVar) {
        bocVar.getClass();
        awxf awxfVar = new awxf(null);
        bocVar.b(new adp(awxfVar, 5));
        return new afqd(awouVar, awxfVar);
    }

    public static final boolean m(Context context) {
        return !((Boolean) ((afpo) aguu.av(context, afpo.class)).bm().e(Boolean.FALSE)).booleanValue();
    }

    public static Context n(View view) {
        if (view.getParent() instanceof View) {
            return V(((View) view.getParent()).getContext(), aupa.class, Activity.class);
        }
        return null;
    }

    public static boolean o(Context context) {
        Context contextV = V(context, aupa.class);
        if (contextV instanceof aupa) {
            aupa aupaVar = (aupa) contextV;
            if (aupaVar.a != null) {
                for (cc ccVarA = aupaVar.a(); ccVarA != null; ccVarA = ccVarA.getParentFragment()) {
                    if (ccVarA.isRemoving()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Set] */
    public static bpl p(cc ccVar, bpl bplVar) {
        afoo afooVar = (afoo) atqp.a(ccVar, afoo.class);
        aciz acizVarM = afooVar.M();
        return new afon(ccVar, ((aunx) atqp.a(afooVar.I().a, aunx.class)).bX().f(bplVar), acizVarM.b, (hil) acizVarM.a);
    }

    public static final /* synthetic */ aibl q(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aibl) aihnVarBuild;
    }

    public static final void r(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibl aiblVar = (aibl) aihfVar.instance;
        aibl aiblVar2 = aibl.a;
        aiblVar.b |= 2;
        aiblVar.d = str;
    }

    public static final void s(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibl aiblVar = (aibl) aihfVar.instance;
        aibl aiblVar2 = aibl.a;
        aiblVar.b |= 1;
        aiblVar.c = j;
    }

    public static final /* synthetic */ aibm t(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aibm) aihnVarBuild;
    }

    public static final void u(aibl aiblVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibm aibmVar = (aibm) aihfVar.instance;
        aibm aibmVar2 = aibm.a;
        aibmVar.c = aiblVar;
        aibmVar.b |= 1;
    }

    public static final void v(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aibg aibgVar = (aibg) aihfVar.instance;
        aibg aibgVar2 = aibg.a;
        aibgVar.b |= 64;
        aibgVar.j = str;
    }

    public static final /* synthetic */ aiac w(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aiac) aihnVarBuild;
    }

    public static final void x(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiac aiacVar = (aiac) aihfVar.instance;
        aiac aiacVar2 = aiac.a;
        aiacVar.c = i - 1;
        aiacVar.b |= 1;
    }

    public static final void y(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiac aiacVar = (aiac) aihfVar.instance;
        aiac aiacVar2 = aiac.a;
        aiacVar.e = i - 1;
        aiacVar.b |= 4;
    }

    public static final void z(aiac aiacVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aiad aiadVar = (aiad) aihfVar.instance;
        aiad aiadVar2 = aiad.a;
        aiadVar.e = aiacVar;
        aiadVar.d = 4;
    }
}
