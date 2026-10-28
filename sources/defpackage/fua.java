package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fua extends fkx {
    public static final /* synthetic */ int R = 0;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    public List A;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int B;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public ColorStateList C;

    @fmt(a = 3)
    @fmu(a = fmv.j)
    public int D;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    public List E;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    Typeface F;
    public fip G;
    fip H;
    public fip I;
    fiq J;
    fiq K;
    fiq L;
    fiq M;
    fiq N;
    fiq O;
    fiq P;
    fiq Q;

    @fmt(a = 3)
    @fmu(a = fmv.g)
    public int a;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    TextUtils.TruncateAt c;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean d;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    int e;

    @fmt(a = 13)
    @fmu(a = fmv.g)
    public Integer f;

    @fmt(a = 13)
    @fmu(a = fmv.b)
    public CharSequence g;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    final ColorStateList q;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    int r;

    @fmt(a = 13)
    @fmu(a = fmv.b)
    public CharSequence s;

    @fmt(a = 13)
    @fmu(a = fmv.l)
    public Drawable t;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    public List u;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int v;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int w;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    final MovementMethod x;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean y;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int z;

    public fua() {
        super("TextInput");
        this.b = true;
        this.e = 8388627;
        this.g = fuh.d;
        this.q = fuh.c;
        this.r = 0;
        this.s = fuh.e;
        this.t = fuh.f;
        this.u = Collections.EMPTY_LIST;
        this.v = 1;
        this.w = Alert.DURATION_SHOW_INDEFINITELY;
        this.x = fuh.h;
        this.y = false;
        this.z = 0;
        this.A = Collections.EMPTY_LIST;
        this.B = 1;
        this.C = fuh.b;
        this.D = -1;
        this.E = Collections.EMPTY_LIST;
        this.F = fuh.g;
    }

    @Deprecated
    public static void aE(fhd fhdVar, String str) {
        fiq fiqVarP = p(fhdVar, -50354224, str);
        if (fiqVarP != null) {
            fiqVarP.a(new fhz());
        }
    }

    protected static void aF(fhd fhdVar) {
        if (fhdVar.c != null) {
            fhdVar.z(new aero(0, new Object[0]), "updateState:TextInput.remeasureForUpdatedText");
        }
    }

    private final ftz aG(fhd fhdVar) {
        return (ftz) fhdVar.i().c;
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        int i = fuh.i;
        return new fuf(context);
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        ftz ftzVarAG = aG(fhdVar);
        CharSequence charSequence = this.s;
        int i = fuh.i;
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference(charSequence);
        ftzVarAG.b = atomicReference;
        ftzVarAG.c = atomicReference2;
        ftzVarAG.a = 0;
    }

    @Override // defpackage.fgy
    protected final void J(fhd fhdVar, Object obj, fiz fizVar) {
        fip fipVar;
        fip fipVar2;
        fip fipVar3;
        fuf fufVar = (fuf) obj;
        List list = this.E;
        int i = fuh.i;
        fgy fgyVar = fhdVar.c;
        if (fgyVar == null) {
            fipVar3 = null;
            fipVar = null;
            fipVar2 = null;
        } else {
            fipVar = ((fua) fgyVar).G;
            fipVar2 = ((fua) fgyVar).H;
            fipVar3 = ((fua) fgyVar).I;
        }
        if (list != null && list.size() > 0) {
            fufVar.l = list.size() == 1 ? (TextWatcher) list.get(0) : new fud(list);
            TextWatcher textWatcher = fufVar.l;
            if (textWatcher != null && (textWatcher instanceof fum)) {
                ((fum) textWatcher).a = fufVar;
            }
            fufVar.addTextChangedListener(textWatcher);
        }
        fufVar.j = fhdVar;
        fufVar.a = fipVar;
        fufVar.b = null;
        fufVar.c = null;
        fufVar.d = null;
        fufVar.e = null;
        fufVar.f = fipVar2;
        fufVar.g = null;
        fufVar.i = fipVar3;
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        ftz ftzVarAG = aG(fhdVar);
        fuf fufVar = (fuf) obj;
        CharSequence charSequence = this.g;
        Drawable drawable = this.t;
        ColorStateList colorStateList = this.C;
        Integer num = this.f;
        int i = this.D;
        Typeface typeface = this.F;
        int i2 = this.B;
        int i3 = this.e;
        boolean z = this.b;
        int i4 = this.v;
        int i5 = this.z;
        int i6 = this.r;
        List list = this.u;
        boolean z2 = this.y;
        int i7 = this.w;
        TextUtils.TruncateAt truncateAt = this.c;
        boolean z3 = this.d;
        int i8 = this.a;
        List list2 = this.A;
        AtomicReference atomicReference = ftzVarAG.c;
        AtomicReference atomicReference2 = ftzVarAG.b;
        int i9 = fuh.i;
        if (z3) {
            fufVar.b();
        }
        atomicReference2.set(fufVar);
        if (!Objects.equals(fufVar.h, list2)) {
            fufVar.h = list2;
            InputMethodManager inputMethodManager = (InputMethodManager) fhdVar.a.getSystemService("input_method");
            if (inputMethodManager != null && (fufVar.isFocused() || inputMethodManager.isActive(fufVar))) {
                inputMethodManager.restartInput(fufVar);
            }
        }
        MovementMethod movementMethod = this.x;
        fuh.b(fhdVar, fufVar, charSequence, fuh.a(fhdVar, drawable), colorStateList, this.q, num, i, typeface, i2, i3, z, i4, i5, i6, list, z2, truncateAt, i7, movementMethod, (CharSequence) atomicReference.get(), false, i8);
        fufVar.k = atomicReference;
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        ftz ftzVar = (ftz) fkyVar;
        ftz ftzVar2 = (ftz) fkyVar2;
        ftzVar2.a = ftzVar.a;
        ftzVar2.b = ftzVar.b;
        ftzVar2.c = ftzVar.c;
    }

    @Override // defpackage.fgy
    public final boolean O() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean V() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:306:0x0460 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:307:0x0462  */
    /* JADX WARN: Code duplicated, block: B:308:0x0464  */
    @Override // defpackage.fgy
    protected final boolean ae(fgy fgyVar, fky fkyVar, fgy fgyVar2, fky fkyVar2) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        fua fuaVar = (fua) fgyVar;
        fua fuaVar2 = (fua) fgyVar2;
        fif fifVar = new fif(fuaVar == null ? null : fuaVar.s, fuaVar2 == null ? null : fuaVar2.s);
        fif fifVar2 = new fif(fuaVar == null ? null : fuaVar.g, fuaVar2 == null ? null : fuaVar2.g);
        fif fifVar3 = new fif(fuaVar == null ? null : fuaVar.t, fuaVar2 == null ? null : fuaVar2.t);
        fif fifVar4 = new fif(fuaVar == null ? null : Float.valueOf(0.0f), fuaVar2 == null ? null : Float.valueOf(0.0f));
        fif fifVar5 = new fif(fuaVar == null ? null : Float.valueOf(0.0f), fuaVar2 == null ? null : Float.valueOf(0.0f));
        fif fifVar6 = new fif(fuaVar == null ? null : Float.valueOf(0.0f), fuaVar2 == null ? null : Float.valueOf(0.0f));
        fif fifVar7 = new fif(fuaVar == null ? null : -7829368, fuaVar2 == null ? null : -7829368);
        fif fifVar8 = new fif(fuaVar == null ? null : fuaVar.C, fuaVar2 == null ? null : fuaVar2.C);
        fif fifVar9 = new fif(fuaVar == null ? null : fuaVar.q, fuaVar2 == null ? null : fuaVar2.q);
        fif fifVar10 = new fif(fuaVar == null ? null : fuaVar.f, fuaVar2 == null ? null : fuaVar2.f);
        fif fifVar11 = new fif(fuaVar == null ? null : Integer.valueOf(fuaVar.D), fuaVar2 == null ? null : Integer.valueOf(fuaVar2.D));
        fif fifVar12 = new fif(fuaVar == null ? null : fuaVar.F, fuaVar2 == null ? null : fuaVar2.F);
        fif fifVar13 = new fif(fuaVar == null ? null : Integer.valueOf(fuaVar.B), fuaVar2 == null ? null : Integer.valueOf(fuaVar2.B));
        fif fifVar14 = new fif(fuaVar == null ? null : Integer.valueOf(fuaVar.e), fuaVar2 == null ? null : Integer.valueOf(fuaVar2.e));
        fif fifVar15 = new fif(fuaVar == null ? null : Boolean.valueOf(fuaVar.b), fuaVar2 == null ? null : Boolean.valueOf(fuaVar2.b));
        fif fifVar16 = new fif(fuaVar == null ? null : Integer.valueOf(fuaVar.v), fuaVar2 == null ? null : Integer.valueOf(fuaVar2.v));
        fif fifVar17 = new fif(fuaVar == null ? null : Integer.valueOf(fuaVar.z), fuaVar2 == null ? null : Integer.valueOf(fuaVar2.z));
        fif fifVar18 = new fif(fuaVar == null ? null : Integer.valueOf(fuaVar.r), fuaVar2 == null ? null : Integer.valueOf(fuaVar2.r));
        fif fifVar19 = new fif(fuaVar == null ? null : fuaVar.u, fuaVar2 == null ? null : fuaVar2.u);
        fif fifVar20 = new fif(fuaVar == null ? null : fuaVar.c, fuaVar2 == null ? null : fuaVar2.c);
        fif fifVar21 = new fif(fuaVar == null ? null : Boolean.valueOf(fuaVar.y), fuaVar2 == null ? null : Boolean.valueOf(fuaVar2.y));
        fif fifVar22 = new fif(fuaVar == null ? null : 1, fuaVar2 == null ? null : Integer.valueOf((int) r15));
        fif fifVar23 = new fif(fuaVar == null ? null : Integer.valueOf(fuaVar.w), fuaVar2 == null ? null : Integer.valueOf(fuaVar2.w));
        fif fifVar24 = new fif(fuaVar == null ? null : -1, fuaVar2 == null ? null : -1);
        fif fifVar25 = new fif(fuaVar == null ? null : fuaVar.x, fuaVar2 == null ? null : fuaVar2.x);
        fif fifVar26 = new fif(null, null);
        fif fifVar27 = new fif(null, null);
        fif fifVar28 = new fif(fuaVar == null ? null : fuaVar.A, fuaVar2 == null ? null : fuaVar2.A);
        fif fifVar29 = new fif(fuaVar == null ? null : ((ftz) fkyVar).a, fuaVar2 == null ? null : ((ftz) fkyVar2).a);
        fif fifVar30 = new fif(fuaVar == null ? null : ((ftz) fkyVar).b, fuaVar2 == null ? null : ((ftz) fkyVar2).b);
        fif fifVar31 = new fif(fuaVar == null ? null : ((ftz) fkyVar).c, fuaVar2 == null ? null : ((ftz) fkyVar2).c);
        Object obj = fifVar29.a;
        int i = fuh.i;
        if (Objects.equals(obj, fifVar29.b) && Objects.equals(fifVar.a, fifVar.b) && Objects.equals(fifVar2.a, fifVar2.b) && Objects.equals(fifVar4.a, fifVar4.b) && Objects.equals(fifVar5.a, fifVar5.b) && Objects.equals(fifVar6.a, fifVar6.b) && Objects.equals(fifVar7.a, fifVar7.b) && Objects.equals(fifVar8.a, fifVar8.b) && Objects.equals(fifVar9.a, fifVar9.b) && Objects.equals(fifVar10.a, fifVar10.b) && Objects.equals(fifVar11.a, fifVar11.b) && Objects.equals(fifVar12.a, fifVar12.b) && Objects.equals(fifVar13.a, fifVar13.b) && Objects.equals(fifVar14.a, fifVar14.b) && Objects.equals(fifVar15.a, fifVar15.b) && Objects.equals(fifVar16.a, fifVar16.b) && Objects.equals(fifVar17.a, fifVar17.b) && Objects.equals(fifVar27.a, fifVar27.b) && Objects.equals(fifVar18.a, fifVar18.b)) {
            List list = (List) fifVar19.a;
            List list2 = (List) fifVar19.b;
            if (list == null) {
                if (list2 == null) {
                    if (Objects.equals(fifVar20.a, fifVar20.b) && Objects.equals(fifVar21.a, fifVar21.b) && ((!((Boolean) fifVar21.b).booleanValue() || (Objects.equals(fifVar22.a, fifVar22.b) && Objects.equals(fifVar23.a, fifVar23.b))) && Objects.equals(fifVar24.a, fifVar24.b) && Objects.equals(fifVar25.a, fifVar25.b) && Objects.equals(fifVar26.a, fifVar26.b) && Objects.equals(fifVar28.a, fifVar28.b) && fifVar30.a == fifVar30.b && fifVar31.a == fifVar31.b)) {
                        drawable = (Drawable) fifVar3.a;
                        drawable2 = (Drawable) fifVar3.b;
                        if (drawable == null) {
                            drawable3 = drawable2;
                        } else if (drawable2 == null) {
                            drawable3 = null;
                        }
                        if (drawable != null || (drawable3 != null && (!(drawable instanceof ColorDrawable) || !(drawable3 instanceof ColorDrawable) ? Objects.equals(drawable.getConstantState(), drawable3.getConstantState()) : ((ColorDrawable) drawable).getColor() == ((ColorDrawable) drawable3).getColor()))) {
                            return false;
                        }
                    }
                }
            } else if (list2 != null && list.size() == list2.size()) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    InputFilter inputFilter = (InputFilter) list.get(i2);
                    InputFilter inputFilter2 = (InputFilter) list2.get(i2);
                    if (!(inputFilter instanceof InputFilter.AllCaps) || !(inputFilter2 instanceof InputFilter.AllCaps)) {
                        if ((inputFilter instanceof InputFilter.LengthFilter) && (inputFilter2 instanceof InputFilter.LengthFilter)) {
                            if (((InputFilter.LengthFilter) inputFilter).getMax() != ((InputFilter.LengthFilter) inputFilter2).getMax()) {
                            }
                        } else if (Objects.equals(inputFilter, inputFilter2)) {
                        }
                    }
                }
                if (Objects.equals(fifVar20.a, fifVar20.b)) {
                    drawable = (Drawable) fifVar3.a;
                    drawable2 = (Drawable) fifVar3.b;
                    if (drawable == null) {
                        drawable3 = drawable2;
                    } else if (drawable2 == null) {
                        drawable3 = null;
                    }
                    if (drawable != null) {
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 3;
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        ftz ftzVarAG = aG(fhdVar);
        CharSequence charSequence = this.g;
        Drawable background = this.t;
        ColorStateList colorStateList = this.C;
        Integer num = this.f;
        int i3 = this.D;
        Typeface typeface = this.F;
        int i4 = this.B;
        int i5 = this.e;
        boolean z = this.b;
        int i6 = this.v;
        int i7 = this.z;
        int i8 = this.r;
        List list = this.u;
        boolean z2 = this.y;
        TextUtils.TruncateAt truncateAt = this.c;
        int i9 = this.w;
        int i10 = this.a;
        AtomicReference atomicReference = ftzVarAG.c;
        int i11 = fuh.i;
        CharSequence string = (CharSequence) atomicReference.get();
        fug fugVar = new fug(fhdVar.a);
        if (string instanceof Spannable) {
            string = string.toString();
        }
        if (background == fuh.a) {
            background = fugVar.getBackground();
        }
        fuh.b(fhdVar, fugVar, charSequence, fuh.a(fhdVar, background), colorStateList, this.q, num, i3, typeface, i4, i5, z, i6, i7, i8, list, z2, truncateAt, i9, fugVar.getMovementMethod(), string, true, i10);
        fugVar.measure(fhz.p(i), fhz.p(i2));
        fkwVar.b = fugVar.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i) == 0) {
            fkwVar.a = 0;
        } else {
            fkwVar.a = Math.min(View.MeasureSpec.getSize(i), fugVar.getMeasuredWidth());
        }
    }

    @Override // defpackage.fgy
    protected final void aq(fhd fhdVar, Object obj) {
        fuf fufVar = (fuf) obj;
        int i = fuh.i;
        TextWatcher textWatcher = fufVar.l;
        if (textWatcher != null) {
            fufVar.removeTextChangedListener(textWatcher);
            TextWatcher textWatcher2 = fufVar.l;
            if (textWatcher2 != null && (textWatcher2 instanceof fum)) {
                ((fum) textWatcher2).a = null;
            }
            fufVar.l = null;
        }
        fufVar.j = null;
        fufVar.a = null;
        fufVar.b = null;
        fufVar.c = null;
        fufVar.d = null;
        fufVar.e = null;
        fufVar.f = null;
        fufVar.g = null;
        fufVar.i = null;
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        AtomicReference atomicReference = aG(fhdVar).b;
        int i = fuh.i;
        ((fuf) obj).k = null;
        atomicReference.set(null);
    }

    @Override // defpackage.fgy
    protected final void ax(fiq fiqVar, Object obj) {
        switch (fiqVar.c) {
            case -1410879082:
                AtomicReference atomicReference = ((fua) fiqVar.a).aG(fiqVar.b).b;
                int i = fuh.i;
                fue fueVar = (fue) atomicReference.get();
                if (fueVar != null) {
                    fueVar.getLineCount();
                }
                break;
            case -537896591:
                AtomicReference atomicReference2 = ((fua) fiqVar.a).aG(fiqVar.b).b;
                int i2 = fuh.i;
                fue fueVar2 = (fue) atomicReference2.get();
                if (fueVar2 != null) {
                    fueVar2.setSelection(0, 0);
                }
                break;
            case -430503342:
                fhd fhdVar = fiqVar.b;
                fua fuaVar = (fua) fiqVar.a;
                AtomicReference atomicReference3 = fuaVar.aG(fhdVar).b;
                AtomicReference atomicReference4 = fuaVar.aG(fhdVar).c;
                int i3 = fuh.i;
                fue fueVar3 = (fue) atomicReference3.get();
                if (fueVar3 != null) {
                    fueVar3.getText();
                }
                break;
            case -122250828:
                fhd fhdVar2 = fiqVar.b;
                fua fuaVar2 = (fua) fiqVar.a;
                AtomicReference atomicReference5 = fuaVar2.aG(fhdVar2).b;
                AtomicReference atomicReference6 = fuaVar2.aG(fhdVar2).c;
                int i4 = fuh.i;
                fue fueVar4 = (fue) atomicReference5.get();
                if (fueVar4 == null) {
                    CharSequence charSequence = (CharSequence) atomicReference6.get();
                    atomicReference6.set(charSequence != null ? new SpannableStringBuilder().append(charSequence.subSequence(0, 0)).append((CharSequence) null).append(charSequence.subSequence(0, charSequence.length())) : null);
                    aF(fhdVar2);
                } else {
                    fueVar4.getText().replace(0, 0, null);
                    fueVar4.setSelection(0);
                }
                break;
            case -50354224:
                AtomicReference atomicReference7 = ((fua) fiqVar.a).aG(fiqVar.b).b;
                int i5 = fuh.i;
                fue fueVar5 = (fue) atomicReference7.get();
                if (fueVar5 != null) {
                    fueVar5.clearFocus();
                    fueVar5.a(false);
                }
                break;
            case 663828400:
                AtomicReference atomicReference8 = ((fua) fiqVar.a).aG(fiqVar.b).b;
                int i6 = fuh.i;
                fue fueVar6 = (fue) atomicReference8.get();
                if (fueVar6 != null) {
                    fueVar6.dispatchKeyEvent(null);
                }
                break;
            case 1008096338:
                AtomicReference atomicReference9 = ((fua) fiqVar.a).aG(fiqVar.b).b;
                int i7 = fuh.i;
                fue fueVar7 = (fue) atomicReference9.get();
                if (fueVar7 != null && fueVar7.requestFocus()) {
                    fueVar7.a(true);
                    break;
                }
                break;
            case 2092727750:
                fhd fhdVar3 = fiqVar.b;
                fua fuaVar3 = (fua) fiqVar.a;
                AtomicReference atomicReference10 = fuaVar3.aG(fhdVar3).b;
                AtomicReference atomicReference11 = fuaVar3.aG(fhdVar3).c;
                int i8 = fuh.i;
                gzj.aS();
                fue fueVar8 = (fue) atomicReference10.get();
                if (fueVar8 != null) {
                    fueVar8.setText((CharSequence) null);
                    fueVar8.setSelection(0);
                } else {
                    atomicReference11.set(null);
                    aF(fhdVar3);
                }
                break;
        }
    }

    @Override // defpackage.fgy
    public final void az(fhd fhdVar, gat gatVar) {
        fiq fiqVar = this.J;
        if (fiqVar != null) {
            fiqVar.b = fhdVar;
            fiqVar.a = this;
            gatVar.d(fiqVar);
        }
        fiq fiqVar2 = this.K;
        if (fiqVar2 != null) {
            fiqVar2.b = fhdVar;
            fiqVar2.a = this;
            gatVar.d(fiqVar2);
        }
        fiq fiqVar3 = this.L;
        if (fiqVar3 != null) {
            fiqVar3.b = fhdVar;
            fiqVar3.a = this;
            gatVar.d(fiqVar3);
        }
        fiq fiqVar4 = this.M;
        if (fiqVar4 != null) {
            fiqVar4.b = fhdVar;
            fiqVar4.a = this;
            gatVar.d(fiqVar4);
        }
        fiq fiqVar5 = this.N;
        if (fiqVar5 != null) {
            fiqVar5.b = fhdVar;
            fiqVar5.a = this;
            gatVar.d(fiqVar5);
        }
        fiq fiqVar6 = this.O;
        if (fiqVar6 != null) {
            fiqVar6.b = fhdVar;
            fiqVar6.a = this;
            gatVar.d(fiqVar6);
        }
        fiq fiqVar7 = this.P;
        if (fiqVar7 != null) {
            fiqVar7.b = fhdVar;
            fiqVar7.a = this;
            gatVar.d(fiqVar7);
        }
        fiq fiqVar8 = this.Q;
        if (fiqVar8 != null) {
            fiqVar8.b = fhdVar;
            fiqVar8.a = this;
            gatVar.d(fiqVar8);
        }
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        TextUtils.TruncateAt truncateAt;
        Integer num;
        CharSequence charSequence;
        ColorStateList colorStateList;
        CharSequence charSequence2;
        Drawable drawable;
        List list;
        MovementMethod movementMethod;
        List list2;
        ColorStateList colorStateList2;
        List list3;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            fua fuaVar = (fua) fgyVar;
            if (this.a == fuaVar.a && this.b == fuaVar.b && ((truncateAt = this.c) == null ? fuaVar.c == null : truncateAt.equals(fuaVar.c)) && this.d == fuaVar.d && this.e == fuaVar.e && ((num = this.f) == null ? fuaVar.f == null : num.equals(fuaVar.f)) && ((charSequence = this.g) == null ? fuaVar.g == null : charSequence.equals(fuaVar.g)) && ((colorStateList = this.q) == null ? fuaVar.q == null : colorStateList.equals(fuaVar.q)) && this.r == fuaVar.r && ((charSequence2 = this.s) == null ? fuaVar.s == null : charSequence2.equals(fuaVar.s)) && ((drawable = this.t) == null ? fuaVar.t == null : drawable.equals(fuaVar.t)) && ((list = this.u) == null ? fuaVar.u == null : list.equals(fuaVar.u)) && this.v == fuaVar.v && this.w == fuaVar.w && ((movementMethod = this.x) == null ? fuaVar.x == null : movementMethod.equals(fuaVar.x)) && this.y == fuaVar.y && this.z == fuaVar.z && ((list2 = this.A) == null ? fuaVar.A == null : list2.equals(fuaVar.A)) && this.B == fuaVar.B && ((colorStateList2 = this.C) == null ? fuaVar.C == null : colorStateList2.equals(fuaVar.C)) && this.D == fuaVar.D && ((list3 = this.E) == null ? fuaVar.E == null : list3.equals(fuaVar.E))) {
                Typeface typeface = this.F;
                if (typeface != null) {
                    if (typeface.equals(fuaVar.F)) {
                        return true;
                    }
                } else if (fuaVar.F == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 3;
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (fua) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new ftz();
    }
}
