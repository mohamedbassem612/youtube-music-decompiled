package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mji extends EditText implements TextView.OnEditorActionListener, View.OnFocusChangeListener {
    private static final InputFilter[] h = new InputFilter[0];
    private static final ColorStateList i = ColorStateList.valueOf(-3355444);
    private static final Rect j = new Rect();
    private static final BreakIterator k = BreakIterator.getCharacterInstance();
    public mjh a;
    public TextWatcher b;
    public boolean c;
    public boolean d;
    public AtomicInteger e;
    public AtomicReference f;
    orx g;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private CharSequence p;
    private final boolean q;
    private eol r;

    public mji(Context context, boolean z) {
        super(context);
        this.l = 0;
        this.p = "";
        this.d = false;
        this.q = z;
    }

    static CharSequence a(nar narVar, AtomicReference atomicReference) {
        if (atomicReference == null || ((List) atomicReference.get()).isEmpty()) {
            return (narVar.F() && narVar.l().y()) ? narVar.l().u() : "";
        }
        List list = (List) atomicReference.get();
        String strU = null;
        if (narVar.F() && narVar.l().y()) {
            strU = narVar.l().u();
        }
        if (strU == null) {
            return (CharSequence) list.get(0);
        }
        return Collection.EL.stream(list).filter(new jor(2)).anyMatch(new jmy(strU, 4)) ? (CharSequence) list.get(0) : strU;
    }

    private final void d(int i2) {
        InputMethodManager inputMethodManager;
        int imeOptions = getImeOptions();
        setImeOptions(i2);
        if (imeOptions == i2 || (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.restartInput(this);
    }

    private static nrv e(mji mjiVar, String str, ntx ntxVar, int i2) {
        nrt nrtVarD = nrv.d();
        nrtVarD.d(mjiVar);
        nrtVarD.g = ntxVar;
        nrtVarD.k = i2;
        aihf aihfVarCreateBuilder = askp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        askp askpVar = (askp) aihfVarCreateBuilder.instance;
        str.getClass();
        askpVar.b |= 1;
        askpVar.c = str;
        askp askpVar2 = (askp) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = asmt.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        asmt asmtVar = (asmt) aihfVarCreateBuilder2.instance;
        askpVar2.getClass();
        asmtVar.d = askpVar2;
        asmtVar.c |= 1;
        boolean zIsFocused = mjiVar.isFocused();
        aihfVarCreateBuilder2.copyOnWrite();
        asmt asmtVar2 = (asmt) aihfVarCreateBuilder2.instance;
        asmtVar2.c |= 8;
        asmtVar2.f = zIsFocused;
        int selectionEnd = mjiVar.getSelectionEnd();
        aihfVarCreateBuilder2.copyOnWrite();
        asmt asmtVar3 = (asmt) aihfVarCreateBuilder2.instance;
        asmtVar3.c |= 2;
        asmtVar3.e = selectionEnd;
        BreakIterator breakIterator = k;
        breakIterator.setText(str);
        breakIterator.first();
        int i3 = 0;
        while (breakIterator.next() != -1) {
            i3++;
        }
        aihfVarCreateBuilder2.copyOnWrite();
        asmt asmtVar4 = (asmt) aihfVarCreateBuilder2.instance;
        asmtVar4.c |= 16;
        asmtVar4.g = i3;
        if (mjiVar.d) {
            int lineCount = mjiVar.getLineCount();
            aihfVarCreateBuilder2.copyOnWrite();
            asmt asmtVar5 = (asmt) aihfVarCreateBuilder2.instance;
            asmtVar5.c |= 64;
            asmtVar5.i = lineCount;
        }
        asmt asmtVar6 = (asmt) aihfVarCreateBuilder2.build();
        aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
        aihhVar.e(asmt.b, asmtVar6);
        nrtVarD.e = (SenderStateOuterClass$SenderState) aihhVar.build();
        return nrtVarD.a();
    }

    private final eol f() {
        eol eolVar = this.r;
        if (eolVar != null) {
            return eolVar;
        }
        eol eolVar2 = new eol((EditText) this, (byte[]) null);
        this.r = eolVar2;
        return eolVar2;
    }

    public final void b() {
        mjh mjhVar = this.a;
        omj omjVar = mjhVar.l;
        if (omjVar != null) {
            mjhVar.f.a(omjVar.x(), e(this, getText().toString(), this.a.h.x, 21)).D();
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0201  */
    /* JADX WARN: Code duplicated, block: B:106:0x0205  */
    /* JADX WARN: Code duplicated, block: B:108:0x020b  */
    /* JADX WARN: Code duplicated, block: B:111:0x021b  */
    /* JADX WARN: Code duplicated, block: B:113:0x021f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0223  */
    /* JADX WARN: Code duplicated, block: B:116:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x022e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0230 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0232 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0234  */
    /* JADX WARN: Code duplicated, block: B:121:0x0236  */
    /* JADX WARN: Code duplicated, block: B:122:0x0238  */
    /* JADX WARN: Code duplicated, block: B:123:0x023a  */
    /* JADX WARN: Code duplicated, block: B:124:0x023c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0247  */
    /* JADX WARN: Code duplicated, block: B:133:0x025a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0269  */
    /* JADX WARN: Code duplicated, block: B:138:0x0272 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x0274  */
    /* JADX WARN: Code duplicated, block: B:142:0x0282  */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, mxc] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, mxc] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, mxc] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, mxc] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, mxc] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, mxc] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.Object, mxc] */
    /* JADX WARN: Type inference failed for: r6v53, types: [java.lang.Object, mxc] */
    public final void c(nar narVar, mjh mjhVar) {
        int i2;
        int i3;
        int i4;
        int imeOptions;
        int iJ;
        mjh mjhVar2;
        boolean zU;
        boolean zIsFocused;
        int iG;
        float f;
        this.a = mjhVar;
        agev agevVarI = narVar.F() ? agev.i(narVar.l()) : agdf.a;
        CharSequence charSequenceA = a(narVar, this.f);
        float f2 = 0.0f;
        int i5 = 2;
        if (agevVarI.g() && (agevVarI.c().y() || TextUtils.isEmpty(agevVarI.c().u()))) {
            mxc mxcVarL = narVar.l();
            int i6 = 0;
            while (i6 < mxcVarL.m()) {
                mxy mxyVarT = mxcVarL.t(i6);
                if (mxyVarT == null || mxyVarT.m() != 0) {
                    f = f2;
                } else {
                    if (mxyVarT.h() != f2) {
                        if (mxyVarT.C() == 2) {
                            setTextSize(1, mxyVarT.h());
                        } else {
                            setTextSize(mxyVarT.h());
                        }
                    }
                    if (mxyVarT.A()) {
                        setLetterSpacing(mxyVarT.i());
                    }
                    if (mxyVarT.w()) {
                        setTextColor(ColorStateList.valueOf(mxyVarT.k()));
                    }
                    Context context = getContext();
                    f = f2;
                    Typeface typefaceH = msf.h(context, context.getResources(), mxyVarT, mjhVar.b, mjhVar.c, mjhVar.h, false);
                    if (typefaceH != null) {
                        setTypeface(typefaceH);
                    }
                }
                i6++;
                f2 = f;
            }
        }
        float f3 = f2;
        if (agevVarI.g() && agevVarI.c().m() > 0) {
            for (int i7 = 0; i7 < agevVarI.c().m(); i7++) {
                mxy mxyVarT2 = agevVarI.c().t(i7);
                if (mxyVarT2 != null && mxyVarT2.m() == 0) {
                    if (mxyVarT2.h() == f3) {
                        break;
                    }
                    if (mxyVarT2.C() != 2) {
                        setTextSize(2, mxyVarT2.h());
                        break;
                    } else {
                        setTextSize(1, mxyVarT2.h());
                        break;
                    }
                }
            }
        } else {
            setTextSize(2, 14.0f);
        }
        boolean z = mjhVar.e;
        if (z && !this.o && men.b) {
            f();
            this.o = true;
            setKeyListener(super.getKeyListener());
        }
        agev agevVarI2 = narVar.D() ? agev.i(narVar.k()) : agdf.a;
        if (agevVarI2.g()) {
            nsl nslVar = this.a.h;
            Context context2 = getContext();
            ?? C = agevVarI2.c();
            mjh mjhVar3 = this.a;
            nry nryVar = mjhVar3.f;
            nxl nxlVar = mjhVar3.b;
            nuc nucVar = mjhVar3.c;
            nso nsoVar = mjhVar3.d;
            setHint(msf.i(nslVar, context2, C, nryVar, nxlVar, nucVar, mjhVar3.g, null, mjhVar3.m, mjhVar3.e, false, false, false, 0));
            setHintTextColor(i);
        }
        int iH = narVar.H() - 1;
        int i8 = 4;
        if (iH == 2) {
            i2 = 16384;
        } else if (iH != 3) {
            i2 = iH != 4 ? 0 : SemanticState.Obscured;
        } else {
            i2 = SemanticState.Multiline;
        }
        switch (narVar.I() - 1) {
            case 2:
                i3 = 2;
                break;
            case 3:
                i3 = 3;
                break;
            case 4:
                i3 = 8194;
                break;
            case 5:
            case 9:
                i3 = 32;
                break;
            case 6:
                i3 = 16;
                break;
            case 7:
                i3 = 96;
                break;
            case 8:
            default:
                int i9 = narVar.i();
                if (i9 == 1) {
                    setLines(1);
                    i3 = 1;
                } else {
                    setMinLines(1);
                    if (i9 <= 1) {
                        i9 = Alert.DURATION_SHOW_INDEFINITELY;
                    }
                    setMaxLines(i9);
                    i3 = 131073;
                }
                break;
        }
        int i10 = i3 | i2;
        omj omjVar = this.a.l;
        int i11 = 6;
        if (omjVar != null) {
            this.m = mda.h(narVar);
            this.n = mda.g(omjVar.x());
            setOnEditorActionListener(this);
            if (!this.m) {
                if (this.n) {
                    i4 = (-131073) & i10;
                    d(6);
                } else if (this.b == null) {
                    this.b = new oru(this, 1);
                }
            }
            if (i4 != 0) {
                setRawInputType(i4);
            } else if (i10 != getInputType()) {
                setInputType(i10);
            }
            imeOptions = getImeOptions() & (-256);
            if (!narVar.E()) {
                iJ = narVar.J() - 1;
                if (iJ != 1) {
                    i11 = 2;
                } else if (iJ != 2) {
                    i11 = 3;
                } else if (iJ != 3) {
                    i11 = 4;
                } else if (iJ != 4) {
                    i11 = 5;
                } else if (iJ != 5) {
                    i11 = 0;
                }
                d(imeOptions | i11);
            } else if (!this.n) {
                d(imeOptions);
            }
            if (narVar.G() == 2) {
                setBackground(new ColorDrawable(0));
            }
            mjhVar2 = this.a;
            if (mjhVar2.j == null || mjhVar2.k != null) {
                setOnFocusChangeListener(this);
            }
            zU = narVar.u();
            zIsFocused = isFocused();
            if (zU) {
                if (!zIsFocused) {
                    post(new mga(this, 2));
                }
            } else if (zIsFocused) {
                post(new mga(this, 3));
            }
            iG = narVar.g();
            if (iG != 0) {
                rpi.y(this, iG);
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iG);
                int i12 = bac.a;
                setBackgroundTintList(colorStateListValueOf);
            }
            setTextAlignment(5);
            setGravity(8388611);
            setEnabled(!narVar.t());
            this.l = narVar.h();
            if (agevVarI.g() || charSequenceA == null || getText().toString().equals(charSequenceA.toString())) {
                return;
            }
            int iG2 = agevVarI.c().G() - 1;
            if (iG2 == 1) {
                setGravity(3);
            } else if (iG2 == 2) {
                setGravity(5);
                setTextAlignment(1);
            } else if (iG2 != 3) {
                setGravity(8388611);
                setTextAlignment(5);
            } else {
                setGravity(1);
                setTextAlignment(4);
            }
            setFilters(h);
            CharSequence charSequenceI = msf.i(mjhVar.h, getContext(), agevVarI.c(), mjhVar.f, mjhVar.b, mjhVar.c, mjhVar.g, null, mjhVar.m, z, false, false, false, 0);
            AtomicReference atomicReference = this.f;
            List arrayList = atomicReference != null ? (List) atomicReference.get() : new ArrayList();
            if (!arrayList.isEmpty() && !charSequenceI.toString().contentEquals((CharSequence) arrayList.get(0))) {
                Stream streamFilter = Collection.EL.stream(arrayList).filter(new jor(i5));
                String string = charSequenceI.toString();
                string.getClass();
                if (streamFilter.anyMatch(new jmy(string, i8))) {
                    CharSequence charSequence = (CharSequence) arrayList.get(0);
                    setTextKeepState(charSequence);
                    setSelection(charSequence.length());
                    return;
                }
            }
            setTextKeepState(charSequenceI);
            setSelection(charSequenceI.length());
            return;
        }
        setOnEditorActionListener(null);
        this.m = false;
        this.n = false;
        i4 = 0;
        if (i4 != 0) {
            setRawInputType(i4);
        } else if (i10 != getInputType()) {
            setInputType(i10);
        }
        imeOptions = getImeOptions() & (-256);
        if (!narVar.E()) {
            iJ = narVar.J() - 1;
            if (iJ != 1) {
                i11 = 2;
            } else if (iJ != 2) {
                i11 = 3;
            } else if (iJ != 3) {
                i11 = 4;
            } else if (iJ != 4) {
                i11 = 5;
            } else if (iJ != 5) {
                i11 = 0;
            }
            d(imeOptions | i11);
        } else if (!this.n) {
            d(imeOptions);
        }
        if (narVar.G() == 2) {
            setBackground(new ColorDrawable(0));
        }
        mjhVar2 = this.a;
        if (mjhVar2.j == null) {
            setOnFocusChangeListener(this);
        } else {
            setOnFocusChangeListener(this);
        }
        zU = narVar.u();
        zIsFocused = isFocused();
        if (zU) {
            if (!zIsFocused) {
                post(new mga(this, 2));
            }
        } else if (zIsFocused) {
            post(new mga(this, 3));
        }
        iG = narVar.g();
        if (iG != 0) {
            rpi.y(this, iG);
            ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(iG);
            int i13 = bac.a;
            setBackgroundTintList(colorStateListValueOf2);
        }
        setTextAlignment(5);
        setGravity(8388611);
        setEnabled(!narVar.t());
        this.l = narVar.h();
        if (agevVarI.g()) {
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.q) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        return this.o ? f().k(inputConnectionOnCreateInputConnection, editorInfo) : inputConnectionOnCreateInputConnection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r2 == r1) goto L15;
     */
    @Override // android.widget.TextView.OnEditorActionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onEditorAction(android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
        /*
            r0 = this;
            mjh r1 = r0.a
            if (r1 == 0) goto L22
            omj r1 = r1.l
            if (r1 == 0) goto L22
            boolean r1 = r0.m
            if (r1 != 0) goto L1d
            boolean r1 = r0.n
            if (r1 != 0) goto L1d
            int r1 = r0.getImeOptions()
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L22
            r3 = 6
            if (r2 == r3) goto L1d
            if (r2 != r1) goto L22
        L1d:
            r0.b()
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mji.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        orx orxVar;
        mjh mjhVar = this.a;
        if (mjhVar != null) {
            if (mjhVar.a.v() && (orxVar = this.g) != null) {
                if (z) {
                    mej.d(this);
                    this.g.b(this);
                } else {
                    orxVar.d();
                }
            }
            mjh mjhVar2 = this.a;
            omj omjVar = mjhVar2.j;
            if (z && omjVar != null) {
                mjhVar2.f.a(omjVar.x(), e(this, getText().toString(), this.a.h.x, 0)).D();
                return;
            }
            omj omjVar2 = mjhVar2.k;
            if (z || omjVar2 == null) {
                return;
            }
            mjhVar2.f.a(omjVar2.x(), e(this, getText().toString(), this.a.h.x, 0)).D();
        }
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        CharSequence charSequence2;
        CharSequence charSequence3;
        super.onTextChanged(charSequence, i2, i3, i4);
        if (this.c) {
            AtomicReference atomicReference = this.f;
            if (atomicReference != null) {
                List list = (List) atomicReference.get();
                if (list.size() == 10) {
                    list.remove(9);
                }
                list.add(0, charSequence.toString());
            }
            if (this.a != null) {
                if (charSequence.length() == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
                    return;
                }
                if (this.l <= 0 || (charSequence3 = this.p) == null || !charSequence3.toString().contentEquals(getText())) {
                    if (this.l > 0 && getLineCount() > this.l && (charSequence2 = this.p) != null) {
                        setTextKeepState(charSequence2);
                        return;
                    }
                    mjh mjhVar = this.a;
                    omj omjVar = mjhVar.i;
                    if (omjVar != null) {
                        mjhVar.f.a(omjVar.x(), e(this, charSequence.toString(), this.a.h.x, 0)).D();
                    }
                    this.p = new SpannableStringBuilder(charSequence);
                    int lineCount = getLineCount();
                    AtomicInteger atomicInteger = this.e;
                    if (atomicInteger == null || lineCount == atomicInteger.get()) {
                        return;
                    }
                    this.e.set(lineCount);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000d  */
    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
            if (!drawable.getPadding(j)) {
                setPadding(0, 0, 0, 0);
            }
        } else {
            setPadding(0, 0, 0, 0);
        }
        super.setBackground(drawable);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (this.o && keyListener != null) {
            f();
            keyListener = eol.l(keyListener);
        }
        super.setKeyListener(keyListener);
    }
}
