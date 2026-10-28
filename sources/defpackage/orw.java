package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import j$.util.Objects;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class orw extends EditText implements TextView.OnEditorActionListener, View.OnFocusChangeListener {
    public static final int[] a;
    static final asxe s;
    private static final ColorStateList t = ColorStateList.valueOf(-3355444);
    private static final Rect u;
    private static final BreakIterator v;
    private static final InputFilter w;
    private final InputFilter A;
    final Handler b;
    public atfx c;
    public oph d;
    final List e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    orx l;
    public int m;
    public int n;
    public int o;
    public String p;
    public boolean q;
    public boolean r;
    private TextWatcher x;
    private final ElementsServices y;
    private final owu z;

    static {
        int i = asxe.A;
        s = asxc.a;
        u = new Rect();
        v = BreakIterator.getCharacterInstance();
        w = new ort();
        a = new int[]{8252, 8265, 8416, 8419, 8482, 8505, 8596, 8597, 8598, 8599, 8600, 8601, 8617, 8618, 8986, 8987, 9000, 9167, 9193, 9194, 9195, 9196, 9197, 9198, 9199, 9200, 9201, 9202, 9203, 9208, 9209, 9210, 9410, 9642, 9643, 9654, 9664, 9723, 9724, 9725, 9726, 9728, 9729, 9730, 9731, 9732, 9742, 9745, 9748, 9749, 9752, 9757, 9760, 9762, 9763, 9766, 9770, 9774, 9775, 9784, 9785, 9786, 9792, 9794, 9800, 9801, 9802, 9803, 9804, 9805, 9806, 9807, 9808, 9809, 9810, 9811, 9823, 9824, 9827, 9829, 9830, 9832, 9851, 9854, 9855, 9874, 9875, 9876, 9877, 9878, 9879, 9881, 9883, 9884, 9888, 9889, 9895, 9898, 9899, 9904, 9905, 9917, 9918, 9924, 9925, 9928, 9934, 9935, 9937, 9939, 9940, 9961, 9962, 9968, 9969, 9970, 9971, 9972, 9973, 9975, 9976, 9977, 9978, 9981, 9986, 9989, 9992, 9993, 9994, 9995, 9996, 9997, 9999, 10002, 10004, 10006, 10013, 10017, 10024, 10035, 10036, 10052, 10055, 10060, 10062, 10067, 10068, 10069, 10071, 10083, 10084, 10133, 10134, 10135, 10145, 10160, 10175, 10548, 10549, 11013, 11014, 11015, 11035, 11036, 11088, 11093};
    }

    public orw(Context context, ElementsServices elementsServices, oph ophVar, owu owuVar) {
        super(context);
        this.b = new Handler(Looper.getMainLooper());
        this.e = new ArrayList();
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = 1;
        this.m = 0;
        this.n = -1;
        this.o = -1;
        this.A = new orv(this);
        this.q = false;
        this.r = false;
        this.y = elementsServices;
        this.d = ophVar;
        this.z = owuVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:10:0x001a, B:12:0x0020, B:13:0x0027, B:16:0x003e), top: B:22:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    private final void h() {
        Editable text;
        int iMax;
        int iMax2;
        String str = this.p;
        int length = this.n;
        int length2 = this.o;
        try {
            if (str != null) {
                if (length == -1) {
                }
                this.f = true;
                text = getText();
                if (text != null) {
                    text.replace(0, text.length(), str);
                }
                int length3 = str.length();
                iMax = Math.max(0, Math.min(length, length3));
                iMax2 = Math.max(0, Math.min(length2, length3));
                if (iMax > iMax2) {
                    iMax = iMax2;
                }
                setSelection(iMax, iMax2);
                return;
            }
            str = "";
            text = getText();
            if (text != null) {
                text.replace(0, text.length(), str);
            }
            int length4 = str.length();
            iMax = Math.max(0, Math.min(length, length4));
            iMax2 = Math.max(0, Math.min(length2, length4));
            if (iMax > iMax2) {
                iMax = iMax2;
            }
            setSelection(iMax, iMax2);
            return;
        } finally {
            this.f = false;
        }
        length = str.length();
        length2 = str.length();
        this.f = true;
    }

    private final void i(int i) {
        InputMethodManager inputMethodManager;
        int imeOptions = getImeOptions();
        setImeOptions(i);
        if (imeOptions == i || (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.restartInput(this);
    }

    private static mew j(String str, orw orwVar) {
        int i = asxe.A;
        asxb asxbVar = new asxb();
        asxbVar.aZ(str);
        asxe asxeVarBa = asxbVar.ba();
        atfn atfnVar = new atfn();
        if (asxeVarBa != atfnVar.g) {
            atfnVar.g = asxeVarBa;
            atfnVar.e = true;
        }
        boolean zIsFocused = orwVar.isFocused();
        atfnVar.aR();
        atfnVar.bO(8, 8);
        atfnVar.bK(9, zIsFocused);
        int selectionEnd = orwVar.getSelectionEnd();
        atfnVar.aR();
        atfnVar.bO(8, 2);
        boolean z = atfn.a;
        atfnVar.bQ(true != z ? 16 : 12, selectionEnd);
        BreakIterator breakIterator = v;
        breakIterator.setText(str);
        breakIterator.first();
        int i2 = 0;
        while (breakIterator.next() != -1) {
            i2++;
        }
        atfnVar.aR();
        atfnVar.bO(8, 16);
        atfnVar.bQ(true != z ? 24 : 20, i2);
        if (orwVar.r) {
            int lineCount = orwVar.getLineCount();
            atfnVar.aR();
            atfnVar.bO(8, 64);
            atfnVar.bQ(true != z ? 32 : 24, lineCount);
        }
        atoc atocVar = new atoc((byte[]) null);
        mep mepVar = atfr.d;
        if (atfnVar.d) {
            atfnVar.bG();
        } else {
            atfnVar.d = true;
        }
        atfr atfrVar = new atfr(atfnVar.b);
        if (atfnVar.g != null) {
            atfrVar.g = atfnVar.g;
            atfrVar.e = atfnVar.e;
        }
        atfm atfmVar = atfnVar.f;
        atfrVar.aS();
        atocVar.aS(mepVar, atfrVar);
        return atocVar.aT();
    }

    private static ors k(mew mewVar, orw orwVar, int i) {
        orr orrVarB = ors.b();
        orrVarB.e(orwVar);
        orrVarB.g = mewVar;
        if (i != 0) {
            orrVarB.f = i;
        }
        oph ophVar = orwVar.d;
        orrVarB.b = ophVar.c;
        agkj agkjVar = ophVar.d;
        return orrVarB.a();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:157:0x0305  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0356  */
    /* JADX WARN: Code duplicated, block: B:175:0x035a  */
    /* JADX WARN: Code duplicated, block: B:176:0x035e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x0360  */
    /* JADX WARN: Code duplicated, block: B:178:0x036c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0370  */
    /* JADX WARN: Code duplicated, block: B:183:0x037a  */
    /* JADX WARN: Code duplicated, block: B:184:0x037e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0384  */
    /* JADX WARN: Code duplicated, block: B:188:0x0389  */
    /* JADX WARN: Code duplicated, block: B:194:0x039f  */
    /* JADX WARN: Code duplicated, block: B:195:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:198:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:200:0x03bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x03c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:203:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:205:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:209:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:211:0x03e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:216:0x0410 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x0412 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x0414  */
    /* JADX WARN: Code duplicated, block: B:219:0x041b  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:220:0x0422  */
    /* JADX WARN: Code duplicated, block: B:221:0x042c  */
    /* JADX WARN: Code duplicated, block: B:224:0x0433  */
    /* JADX WARN: Code duplicated, block: B:226:0x043d  */
    /* JADX WARN: Code duplicated, block: B:230:0x044f  */
    /* JADX WARN: Code duplicated, block: B:232:0x0453  */
    /* JADX WARN: Code duplicated, block: B:236:0x0467  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0480  */
    /* JADX WARN: Code duplicated, block: B:245:0x0489  */
    /* JADX WARN: Code duplicated, block: B:246:0x048b  */
    /* JADX WARN: Code duplicated, block: B:249:0x0495  */
    /* JADX WARN: Code duplicated, block: B:250:0x0497  */
    /* JADX WARN: Code duplicated, block: B:252:0x049a  */
    /* JADX WARN: Code duplicated, block: B:254:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:255:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:258:0x04b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:264:0x04c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:265:0x04c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:270:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:273:0x04df  */
    /* JADX WARN: Code duplicated, block: B:275:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:276:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:279:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:281:0x0500  */
    /* JADX WARN: Code duplicated, block: B:282:0x0503  */
    /* JADX WARN: Code duplicated, block: B:285:0x050d  */
    /* JADX WARN: Code duplicated, block: B:288:0x051d  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0527  */
    /* JADX WARN: Code duplicated, block: B:291:0x0529  */
    /* JADX WARN: Code duplicated, block: B:294:0x0534  */
    /* JADX WARN: Code duplicated, block: B:295:0x0536  */
    /* JADX WARN: Code duplicated, block: B:297:0x0539  */
    /* JADX WARN: Code duplicated, block: B:299:0x0543  */
    /* JADX WARN: Code duplicated, block: B:300:0x0545  */
    /* JADX WARN: Code duplicated, block: B:304:0x0551  */
    /* JADX WARN: Code duplicated, block: B:306:0x055d  */
    /* JADX WARN: Code duplicated, block: B:307:0x055f  */
    /* JADX WARN: Code duplicated, block: B:310:0x056c  */
    /* JADX WARN: Code duplicated, block: B:312:0x056f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:317:0x0589  */
    /* JADX WARN: Code duplicated, block: B:319:0x0598 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:320:0x059a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:321:0x059c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:322:0x059e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:323:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:324:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:325:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:326:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:327:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:338:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:340:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:42:0x0117  */
    /* JADX WARN: Code duplicated, block: B:44:0x011a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b2  */
    final void a(atfx atfxVar, agev agevVar, boolean z) {
        float f;
        long j;
        long j2;
        asxe asxeVarBc;
        int i;
        aszd aszdVarBz;
        long j3;
        Context context;
        Resources resources;
        owu owuVar;
        oui ouiVarN;
        Typeface typefaceN;
        long j4;
        boolean z2;
        long j5;
        boolean z3;
        atfx atfxVar2;
        int iBr;
        atfx atfxVar3;
        boolean z4;
        boolean zIsFocused;
        ooz oozVar;
        Handler handler;
        atfx atfxVar4;
        long j6;
        int iPeekInt;
        atfx atfxVar5;
        boolean z5;
        atfx atfxVar6;
        atfx atfxVar7;
        int imeOptions;
        int iBa;
        boolean z6;
        int iPeekByte;
        boolean z7;
        boolean z8;
        long j7;
        long j8;
        boolean z9;
        boolean z10;
        boolean zAV;
        boolean zAV2;
        atfx atfxVar8;
        asxe asxeVarBb;
        int iBs;
        TextUtils.TruncateAt truncateAt;
        int i2;
        int i3;
        boolean z11;
        boolean z12;
        long j9;
        long j10;
        boolean z13;
        boolean z14;
        int i4;
        int i5;
        mew mewVarAX;
        setFocusableInTouchMode(true);
        atfx atfxVar9 = this.c;
        if (atfxVar != null) {
            boolean zAV3 = atfxVar.aV();
            boolean zAV4 = atfxVar9.aV();
            if (zAV3 != zAV4 || (zAV4 && !Objects.equals(atfxVar.bc(), atfxVar9.bc()))) {
                if (agevVar.g()) {
                    f = 0.0f;
                    if ((Memory.peekByte(((mew) agevVar.c()).c + 8) & 1) == 0 || TextUtils.isEmpty(((asxe) agevVar.c()).bi())) {
                        asxeVarBc = this.c.bc();
                        for (i = 0; i < asxeVarBc.bh(); i++) {
                            aszdVarBz = asxeVarBc.bz(i);
                            if (aszdVarBz != null) {
                                j3 = aszdVarBz.c;
                                if (Memory.peekInt(j3 + 12, false) == 0) {
                                    if (Float.intBitsToFloat(Memory.peekInt(j3 + 20, false)) != 0.0f) {
                                        if (aszdVarBz.aX() == 2) {
                                            setTextSize(1, Float.intBitsToFloat(Memory.peekInt(aszdVarBz.c + 20, false)));
                                        } else {
                                            setTextSize(Float.intBitsToFloat(Memory.peekInt(aszdVarBz.c + 20, false)));
                                        }
                                    }
                                    if ((Memory.peekByte(aszdVarBz.c + 9) & 1) != 0) {
                                        long j11 = aszdVarBz.c;
                                        if (true != aszd.a) {
                                            j4 = 36;
                                        } else {
                                            j4 = 32;
                                        }
                                        setLetterSpacing(Float.intBitsToFloat(Memory.peekInt(j11 + j4, false)));
                                    }
                                    if ((Memory.peekByte(aszdVarBz.c + 8) & 16) != 0) {
                                        setTextColor(ColorStateList.valueOf(Memory.peekInt(aszdVarBz.c + 24, false)));
                                    }
                                    context = getContext();
                                    resources = context.getResources();
                                    owuVar = this.z;
                                    ouiVarN = this.y.n();
                                    int i6 = owt.c;
                                    if ((Memory.peekByte(aszdVarBz.c + 9) & 8) != 0) {
                                        typefaceN = owt.n(context, resources, aszdVarBz.aV(), aszdVarBz, owuVar.a, ouiVarN);
                                    } else {
                                        typefaceN = null;
                                    }
                                    if (typefaceN != null) {
                                        setTypeface(typefaceN);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    f = 0.0f;
                }
                j = 9;
                j2 = 12;
                if (agevVar.g() || ((asxe) agevVar.c()).bh() <= 0) {
                    setTextSize(2, 14.0f);
                } else {
                    for (int i7 = 0; i7 < ((asxe) agevVar.c()).bh(); i7++) {
                        aszd aszdVarBz2 = ((asxe) agevVar.c()).bz(i7);
                        if (aszdVarBz2 != null) {
                            long j12 = aszdVarBz2.c;
                            if (Memory.peekInt(j12 + 12, false) == 0) {
                                if (Float.intBitsToFloat(Memory.peekInt(j12 + 20, false)) == f) {
                                    break;
                                }
                                if (aszdVarBz2.aX() != 2) {
                                    setTextSize(2, Float.intBitsToFloat(Memory.peekInt(aszdVarBz2.c + 20, false)));
                                    break;
                                } else {
                                    setTextSize(1, Float.intBitsToFloat(Memory.peekInt(aszdVarBz2.c + 20, false)));
                                    break;
                                }
                            }
                        }
                    }
                }
            } else {
                j = 9;
                j2 = 12;
            }
        } else {
            if (agevVar.g()) {
                f = 0.0f;
                if ((Memory.peekByte(((mew) agevVar.c()).c + 8) & 1) == 0) {
                    asxeVarBc = this.c.bc();
                    while (i < asxeVarBc.bh()) {
                        aszdVarBz = asxeVarBc.bz(i);
                        if (aszdVarBz != null) {
                            j3 = aszdVarBz.c;
                            if (Memory.peekInt(j3 + 12, false) == 0) {
                                if (Float.intBitsToFloat(Memory.peekInt(j3 + 20, false)) != 0.0f) {
                                    if (aszdVarBz.aX() == 2) {
                                        setTextSize(1, Float.intBitsToFloat(Memory.peekInt(aszdVarBz.c + 20, false)));
                                    } else {
                                        setTextSize(Float.intBitsToFloat(Memory.peekInt(aszdVarBz.c + 20, false)));
                                    }
                                }
                                if ((Memory.peekByte(aszdVarBz.c + 9) & 1) != 0) {
                                    long j13 = aszdVarBz.c;
                                    if (true != aszd.a) {
                                        j4 = 36;
                                    } else {
                                        j4 = 32;
                                    }
                                    setLetterSpacing(Float.intBitsToFloat(Memory.peekInt(j13 + j4, false)));
                                }
                                if ((Memory.peekByte(aszdVarBz.c + 8) & 16) != 0) {
                                    setTextColor(ColorStateList.valueOf(Memory.peekInt(aszdVarBz.c + 24, false)));
                                }
                                context = getContext();
                                resources = context.getResources();
                                owuVar = this.z;
                                ouiVarN = this.y.n();
                                int i8 = owt.c;
                                if ((Memory.peekByte(aszdVarBz.c + 9) & 8) != 0) {
                                    typefaceN = owt.n(context, resources, aszdVarBz.aV(), aszdVarBz, owuVar.a, ouiVarN);
                                } else {
                                    typefaceN = null;
                                }
                                if (typefaceN != null) {
                                    setTypeface(typefaceN);
                                }
                            }
                        }
                    }
                } else {
                    asxeVarBc = this.c.bc();
                    while (i < asxeVarBc.bh()) {
                        aszdVarBz = asxeVarBc.bz(i);
                        if (aszdVarBz != null) {
                            j3 = aszdVarBz.c;
                            if (Memory.peekInt(j3 + 12, false) == 0) {
                                if (Float.intBitsToFloat(Memory.peekInt(j3 + 20, false)) != 0.0f) {
                                    if (aszdVarBz.aX() == 2) {
                                        setTextSize(1, Float.intBitsToFloat(Memory.peekInt(aszdVarBz.c + 20, false)));
                                    } else {
                                        setTextSize(Float.intBitsToFloat(Memory.peekInt(aszdVarBz.c + 20, false)));
                                    }
                                }
                                if ((Memory.peekByte(aszdVarBz.c + 9) & 1) != 0) {
                                    long j14 = aszdVarBz.c;
                                    if (true != aszd.a) {
                                        j4 = 36;
                                    } else {
                                        j4 = 32;
                                    }
                                    setLetterSpacing(Float.intBitsToFloat(Memory.peekInt(j14 + j4, false)));
                                }
                                if ((Memory.peekByte(aszdVarBz.c + 8) & 16) != 0) {
                                    setTextColor(ColorStateList.valueOf(Memory.peekInt(aszdVarBz.c + 24, false)));
                                }
                                context = getContext();
                                resources = context.getResources();
                                owuVar = this.z;
                                ouiVarN = this.y.n();
                                int i9 = owt.c;
                                if ((Memory.peekByte(aszdVarBz.c + 9) & 8) != 0) {
                                    typefaceN = owt.n(context, resources, aszdVarBz.aV(), aszdVarBz, owuVar.a, ouiVarN);
                                } else {
                                    typefaceN = null;
                                }
                                if (typefaceN != null) {
                                    setTypeface(typefaceN);
                                }
                            }
                        }
                    }
                }
            } else {
                f = 0.0f;
            }
            j = 9;
            j2 = 12;
            if (agevVar.g()) {
                setTextSize(2, 14.0f);
            } else {
                setTextSize(2, 14.0f);
            }
        }
        atfx atfxVar10 = this.c;
        if (atfxVar != null) {
            boolean zAU = atfxVar.aU();
            boolean zAU2 = atfxVar10.aU();
            if (zAU != zAU2 || (zAU2 && !Objects.equals(atfxVar.bb(), atfxVar10.bb()))) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (z2) {
            agev agevVarI = this.c.aU() ? agev.i(this.c.bb()) : agdf.a;
            if (agevVarI.g()) {
                ElementsServices elementsServices = this.y;
                Context contextC = elementsServices.c();
                DisplayMetrics displayMetricsE = elementsServices.e();
                Object objC = agevVarI.c();
                owu owuVar2 = this.z;
                setHint(owt.p(contextC, displayMetricsE, (asxe) objC, elementsServices.l(), owuVar2.a, elementsServices.n(), owuVar2.c, null, owuVar2.d));
                setHintTextColor(t);
            }
        }
        atfx atfxVar11 = this.c;
        if (atfxVar == null) {
            z3 = z2;
            j5 = 14;
        } else {
            j5 = 14;
            if (atfxVar.aY() == atfxVar11.aY() && atfxVar.aZ() == atfxVar11.aZ()) {
                long j15 = atfxVar.c;
                long j16 = true != atfz.a ? 40L : 20L;
                int iPeekInt2 = Memory.peekInt(j15 + j16, false);
                z3 = z2;
                long j17 = atfxVar11.c;
                if (iPeekInt2 == Memory.peekInt(j16 + j17, false)) {
                    if ((Memory.peekByte(j15 + 14) != 0) != (Memory.peekByte(j17 + 14) != 0) || !Objects.equals(atfxVar.aX(), atfxVar11.aX())) {
                    }
                }
                if (z3 && (atfxVar8 = this.c) != null && atfxVar8.aU()) {
                    asxeVarBb = this.c.bb();
                    if (asxeVarBb.bq() != 2) {
                        setEllipsize(owt.i(asxeVarBb.bq()));
                    } else {
                        setEllipsize(null);
                    }
                    if (asxeVarBb.bq() == 1) {
                        iBs = asxeVarBb.bs() - 1;
                        int i10 = owt.c;
                        if (iBs == 1) {
                            truncateAt = TextUtils.TruncateAt.START;
                        } else if (iBs == 3) {
                            truncateAt = TextUtils.TruncateAt.MIDDLE;
                        } else if (iBs != 4) {
                            truncateAt = TextUtils.TruncateAt.END;
                        } else {
                            truncateAt = TextUtils.TruncateAt.MARQUEE;
                        }
                        setEllipsize(truncateAt);
                    }
                }
                atfxVar2 = this.c;
                if (atfxVar != null) {
                    zAV = atfxVar.aV();
                    zAV2 = atfxVar2.aV();
                    if (zAV == zAV2 || (zAV2 && atfxVar.bc().br() != atfxVar2.bc().br())) {
                        setTextAlignment(5);
                        setGravity(8388611);
                        iBr = ((asxe) agevVar.e(s)).br() - 1;
                        if (iBr != 1) {
                            setGravity(8388611);
                        } else if (iBr != 2) {
                            setGravity(8388613);
                            setTextAlignment(1);
                        } else if (iBr != 3) {
                            setGravity(8388611);
                            setTextAlignment(5);
                        } else {
                            setGravity(1);
                            setTextAlignment(4);
                        }
                    }
                } else {
                    setTextAlignment(5);
                    setGravity(8388611);
                    iBr = ((asxe) agevVar.e(s)).br() - 1;
                    if (iBr != 1) {
                        setGravity(8388611);
                    } else if (iBr != 2) {
                        setGravity(8388613);
                        setTextAlignment(1);
                    } else if (iBr != 3) {
                        setGravity(8388611);
                        setTextAlignment(5);
                    } else {
                        setGravity(1);
                        setTextAlignment(4);
                    }
                }
                atfx atfxVar12 = this.c;
                if ((atfxVar != null || atfxVar.aW() != atfxVar12.aW()) && this.c.aW() == 2) {
                    setBackground(new ColorDrawable(0));
                }
                if (z) {
                }
                atfx atfxVar13 = this.c;
                if ((atfxVar != null || atfxVar.aS() != atfxVar13.aS() || atfxVar.aR() != atfxVar13.aR()) && (this.c.aS() || this.c.aR())) {
                    setOnFocusChangeListener(this);
                }
                atfxVar3 = this.c;
                if (atfxVar == null) {
                    if (Memory.peekByte(atfxVar3.c + 11) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zIsFocused = isFocused();
                    boolean z15 = this.g;
                    this.g = z4;
                    if (zIsFocused && z4 && !z15) {
                        ooz oozVar2 = new ooz(this, 2);
                        Handler handler2 = this.b;
                        if (handler2 != null) {
                            handler2.post(oozVar2);
                        } else {
                            post(oozVar2);
                        }
                    } else if (zIsFocused && !z4 && z15) {
                        oozVar = new ooz(this, 3);
                        handler = this.b;
                        if (handler != null) {
                            handler.post(oozVar);
                        } else {
                            post(oozVar);
                        }
                    }
                } else {
                    if (Memory.peekByte(atfxVar.c + 11) == 0) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Memory.peekByte(atfxVar3.c + 11) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z9 != z10) {
                        if (Memory.peekByte(atfxVar3.c + 11) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zIsFocused = isFocused();
                        boolean z16 = this.g;
                        this.g = z4;
                        if (zIsFocused) {
                            if (zIsFocused) {
                                oozVar = new ooz(this, 3);
                                handler = this.b;
                                if (handler != null) {
                                    handler.post(oozVar);
                                } else {
                                    post(oozVar);
                                }
                            }
                        } else if (zIsFocused) {
                            oozVar = new ooz(this, 3);
                            handler = this.b;
                            if (handler != null) {
                                handler.post(oozVar);
                            } else {
                                post(oozVar);
                            }
                        }
                    }
                }
                atfxVar4 = this.c;
                if (atfxVar != null) {
                    j7 = atfxVar.c;
                    if (true != atfz.a) {
                        j8 = 56;
                    } else {
                        j8 = 32;
                    }
                    if (Memory.peekInt(j7 + j8, false) != Memory.peekInt(atfxVar4.c + j8, false)) {
                        long j18 = atfxVar4.c;
                        if (true != atfz.a) {
                            j6 = 56;
                        } else {
                            j6 = 32;
                        }
                        iPeekInt = Memory.peekInt(j18 + j6, false);
                        if (iPeekInt != 0) {
                            rpi.y(this, iPeekInt);
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iPeekInt);
                            int i11 = bac.a;
                            setBackgroundTintList(colorStateListValueOf);
                        }
                    }
                } else {
                    long j19 = atfxVar4.c;
                    if (true != atfz.a) {
                        j6 = 56;
                    } else {
                        j6 = 32;
                    }
                    iPeekInt = Memory.peekInt(j19 + j6, false);
                    if (iPeekInt != 0) {
                        rpi.y(this, iPeekInt);
                        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(iPeekInt);
                        int i12 = bac.a;
                        setBackgroundTintList(colorStateListValueOf2);
                    }
                }
                atfxVar5 = this.c;
                if (atfxVar == null) {
                    if (Memory.peekByte(atfxVar5.c + j2) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    setEnabled(!z5);
                } else {
                    if (Memory.peekByte(atfxVar.c + j2) == 0) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (Memory.peekByte(atfxVar5.c + j2) == 0) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (z7 != z8) {
                        if (Memory.peekByte(atfxVar5.c + j2) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        setEnabled(!z5);
                    }
                }
                atfxVar6 = this.c;
                if (atfxVar != null) {
                    if ((Memory.peekByte(atfxVar.c + j) & 128) == 0) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    iPeekByte = Memory.peekByte(atfxVar6.c + j) & 128;
                    if (z6 == (iPeekByte != 0) && (iPeekByte == 0 || atfxVar.ba() == atfxVar6.ba())) {
                        return;
                    }
                }
                atfxVar7 = this.c;
                if ((Memory.peekByte(atfxVar7.c + j) & 128) != 0) {
                    imeOptions = getImeOptions() & (-256);
                    iBa = atfxVar7.ba() - 1;
                    if (iBa == 1) {
                        imeOptions |= 2;
                    } else if (iBa == 2) {
                        imeOptions |= 3;
                    } else if (iBa == 3) {
                        imeOptions |= 4;
                    } else if (iBa == 4) {
                        imeOptions |= 5;
                    } else if (iBa == 5) {
                        imeOptions |= 6;
                    }
                    i(imeOptions);
                }
            }
            z3 = z2;
        }
        atfx atfxVar14 = this.c;
        int iAY = atfxVar14.aY() - 1;
        if (iAY == 2) {
            i2 = 16384;
        } else if (iAY != 3) {
            i2 = iAY != 4 ? 0 : SemanticState.Obscured;
        } else {
            i2 = SemanticState.Multiline;
        }
        switch (atfxVar14.aZ() - 1) {
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
                i3 = 33;
                break;
            case 6:
                i3 = 17;
                break;
            case 7:
                i3 = 97;
                break;
            case 8:
            default:
                int iPeekInt3 = Memory.peekInt(atfxVar14.c + (true != atfz.a ? 40L : 20L), false);
                if (iPeekInt3 == 1) {
                    setLines(1);
                    i3 = 1;
                } else {
                    setMinLines(1);
                    if (iPeekInt3 <= 1) {
                        iPeekInt3 = Alert.DURATION_SHOW_INDEFINITELY;
                    }
                    setMaxLines(iPeekInt3);
                    i3 = 131073;
                }
                break;
        }
        int i13 = Memory.peekByte(atfxVar14.c + j5) == 0 ? 0 : 524288;
        int i14 = i3 | i2;
        atfx atfxVar15 = this.c;
        if (atfxVar15.aZ() != 9 && atfxVar15.aZ() != 2) {
            z11 = true;
            if (atfxVar15.aZ() != 1) {
                z12 = false;
            }
            j9 = atfxVar15.c;
            if (z11 != atfz.a) {
                j10 = 40;
            } else {
                j10 = 20;
            }
            if (Memory.peekInt(j9 + j10, false) == z11 && z12) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (atfxVar15.aT() || (mewVarAX = atfxVar15.aX()) == null) {
                z14 = false;
            } else {
                mep mepVar = asrf.d;
                if (!mewVarAX.e(mepVar)) {
                    mep mepVar2 = atmo.d;
                    if (mewVarAX.e(mepVar2)) {
                        atmo atmoVar = (atmo) mewVarAX.d(mepVar2);
                        atmoVar.aR();
                        AtomicReference atomicReference = atmoVar.e;
                        int size = ((ArrayList) atomicReference.get()).size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                atmoVar.aR();
                                if (!((mew) ((ArrayList) atomicReference.get()).get(i15)).e(mepVar)) {
                                    i15++;
                                }
                            }
                        }
                    }
                    z14 = false;
                }
                z14 = true;
            }
            i4 = i14 | i13;
            if (z13) {
                if (z14) {
                    i5 = (-131073) & i4;
                    i(6);
                    setOnEditorActionListener(this);
                } else if (this.x == null) {
                    this.x = new oru(this, 0);
                }
                if (i5 != 0) {
                    setRawInputType(i5);
                } else if (i4 != getInputType()) {
                    setInputType(i4);
                }
                if (z3) {
                    asxeVarBb = this.c.bb();
                    if (asxeVarBb.bq() != 2) {
                        setEllipsize(owt.i(asxeVarBb.bq()));
                    } else {
                        setEllipsize(null);
                    }
                    if (asxeVarBb.bq() == 1) {
                        iBs = asxeVarBb.bs() - 1;
                        int i16 = owt.c;
                        if (iBs == 1) {
                            truncateAt = TextUtils.TruncateAt.START;
                        } else if (iBs == 3) {
                            truncateAt = TextUtils.TruncateAt.MIDDLE;
                        } else if (iBs != 4) {
                            truncateAt = TextUtils.TruncateAt.END;
                        } else {
                            truncateAt = TextUtils.TruncateAt.MARQUEE;
                        }
                        setEllipsize(truncateAt);
                    }
                }
                atfxVar2 = this.c;
                if (atfxVar != null) {
                    zAV = atfxVar.aV();
                    zAV2 = atfxVar2.aV();
                    if (zAV == zAV2) {
                        setTextAlignment(5);
                        setGravity(8388611);
                        iBr = ((asxe) agevVar.e(s)).br() - 1;
                        if (iBr != 1) {
                            setGravity(8388611);
                        } else if (iBr != 2) {
                            setGravity(8388613);
                            setTextAlignment(1);
                        } else if (iBr != 3) {
                            setGravity(8388611);
                            setTextAlignment(5);
                        } else {
                            setGravity(1);
                            setTextAlignment(4);
                        }
                    } else {
                        setTextAlignment(5);
                        setGravity(8388611);
                        iBr = ((asxe) agevVar.e(s)).br() - 1;
                        if (iBr != 1) {
                            setGravity(8388611);
                        } else if (iBr != 2) {
                            setGravity(8388613);
                            setTextAlignment(1);
                        } else if (iBr != 3) {
                            setGravity(8388611);
                            setTextAlignment(5);
                        } else {
                            setGravity(1);
                            setTextAlignment(4);
                        }
                    }
                } else {
                    setTextAlignment(5);
                    setGravity(8388611);
                    iBr = ((asxe) agevVar.e(s)).br() - 1;
                    if (iBr != 1) {
                        setGravity(8388611);
                    } else if (iBr != 2) {
                        setGravity(8388613);
                        setTextAlignment(1);
                    } else if (iBr != 3) {
                        setGravity(8388611);
                        setTextAlignment(5);
                    } else {
                        setGravity(1);
                        setTextAlignment(4);
                    }
                }
                atfx atfxVar16 = this.c;
                if (atfxVar != null) {
                    setBackground(new ColorDrawable(0));
                } else {
                    setBackground(new ColorDrawable(0));
                }
                if (z) {
                    atfx atfxVar17 = this.c;
                    if (atfxVar != null) {
                        setOnFocusChangeListener(this);
                    } else {
                        setOnFocusChangeListener(this);
                    }
                    atfxVar3 = this.c;
                    if (atfxVar == null) {
                        if (Memory.peekByte(atfxVar3.c + 11) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zIsFocused = isFocused();
                        boolean z17 = this.g;
                        this.g = z4;
                        if (zIsFocused) {
                            if (zIsFocused) {
                                oozVar = new ooz(this, 3);
                                handler = this.b;
                                if (handler != null) {
                                    handler.post(oozVar);
                                } else {
                                    post(oozVar);
                                }
                            }
                        } else if (zIsFocused) {
                            oozVar = new ooz(this, 3);
                            handler = this.b;
                            if (handler != null) {
                                handler.post(oozVar);
                            } else {
                                post(oozVar);
                            }
                        }
                    } else {
                        if (Memory.peekByte(atfxVar.c + 11) == 0) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (Memory.peekByte(atfxVar3.c + 11) == 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z9 != z10) {
                            if (Memory.peekByte(atfxVar3.c + 11) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zIsFocused = isFocused();
                            boolean z18 = this.g;
                            this.g = z4;
                            if (zIsFocused) {
                                if (zIsFocused) {
                                    oozVar = new ooz(this, 3);
                                    handler = this.b;
                                    if (handler != null) {
                                        handler.post(oozVar);
                                    } else {
                                        post(oozVar);
                                    }
                                }
                            } else if (zIsFocused) {
                                oozVar = new ooz(this, 3);
                                handler = this.b;
                                if (handler != null) {
                                    handler.post(oozVar);
                                } else {
                                    post(oozVar);
                                }
                            }
                        }
                    }
                    atfxVar4 = this.c;
                    if (atfxVar != null) {
                        j7 = atfxVar.c;
                        if (true != atfz.a) {
                            j8 = 56;
                        } else {
                            j8 = 32;
                        }
                        if (Memory.peekInt(j7 + j8, false) != Memory.peekInt(atfxVar4.c + j8, false)) {
                            long j110 = atfxVar4.c;
                            if (true != atfz.a) {
                                j6 = 56;
                            } else {
                                j6 = 32;
                            }
                            iPeekInt = Memory.peekInt(j110 + j6, false);
                            if (iPeekInt != 0) {
                                rpi.y(this, iPeekInt);
                                ColorStateList colorStateListValueOf3 = ColorStateList.valueOf(iPeekInt);
                                int i17 = bac.a;
                                setBackgroundTintList(colorStateListValueOf3);
                            }
                        }
                    } else {
                        long j111 = atfxVar4.c;
                        if (true != atfz.a) {
                            j6 = 56;
                        } else {
                            j6 = 32;
                        }
                        iPeekInt = Memory.peekInt(j111 + j6, false);
                        if (iPeekInt != 0) {
                            rpi.y(this, iPeekInt);
                            ColorStateList colorStateListValueOf4 = ColorStateList.valueOf(iPeekInt);
                            int i18 = bac.a;
                            setBackgroundTintList(colorStateListValueOf4);
                        }
                    }
                    atfxVar5 = this.c;
                    if (atfxVar == null) {
                        if (Memory.peekByte(atfxVar5.c + j2) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        setEnabled(!z5);
                    } else {
                        if (Memory.peekByte(atfxVar.c + j2) == 0) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (Memory.peekByte(atfxVar5.c + j2) == 0) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (z7 != z8) {
                            if (Memory.peekByte(atfxVar5.c + j2) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            setEnabled(!z5);
                        }
                    }
                    atfxVar6 = this.c;
                    if (atfxVar != null) {
                        if ((Memory.peekByte(atfxVar.c + j) & 128) == 0) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        iPeekByte = Memory.peekByte(atfxVar6.c + j) & 128;
                        if (z6 == (iPeekByte != 0)) {
                            return;
                        }
                    }
                    atfxVar7 = this.c;
                    if ((Memory.peekByte(atfxVar7.c + j) & 128) != 0) {
                        imeOptions = getImeOptions() & (-256);
                        iBa = atfxVar7.ba() - 1;
                        if (iBa == 1) {
                            imeOptions |= 2;
                        } else if (iBa == 2) {
                            imeOptions |= 3;
                        } else if (iBa == 3) {
                            imeOptions |= 4;
                        } else if (iBa == 4) {
                            imeOptions |= 5;
                        } else if (iBa == 5) {
                            imeOptions |= 6;
                        }
                        i(imeOptions);
                    }
                }
            }
            setOnEditorActionListener(this);
            i5 = 0;
            if (i5 != 0) {
                setRawInputType(i5);
            } else if (i4 != getInputType()) {
                setInputType(i4);
            }
            if (z3) {
                asxeVarBb = this.c.bb();
                if (asxeVarBb.bq() != 2) {
                    setEllipsize(owt.i(asxeVarBb.bq()));
                } else {
                    setEllipsize(null);
                }
                if (asxeVarBb.bq() == 1) {
                    iBs = asxeVarBb.bs() - 1;
                    int i19 = owt.c;
                    if (iBs == 1) {
                        truncateAt = TextUtils.TruncateAt.START;
                    } else if (iBs == 3) {
                        truncateAt = TextUtils.TruncateAt.MIDDLE;
                    } else if (iBs != 4) {
                        truncateAt = TextUtils.TruncateAt.END;
                    } else {
                        truncateAt = TextUtils.TruncateAt.MARQUEE;
                    }
                    setEllipsize(truncateAt);
                }
            }
            atfxVar2 = this.c;
            if (atfxVar != null) {
                zAV = atfxVar.aV();
                zAV2 = atfxVar2.aV();
                if (zAV == zAV2) {
                    setTextAlignment(5);
                    setGravity(8388611);
                    iBr = ((asxe) agevVar.e(s)).br() - 1;
                    if (iBr != 1) {
                        setGravity(8388611);
                    } else if (iBr != 2) {
                        setGravity(8388613);
                        setTextAlignment(1);
                    } else if (iBr != 3) {
                        setGravity(8388611);
                        setTextAlignment(5);
                    } else {
                        setGravity(1);
                        setTextAlignment(4);
                    }
                } else {
                    setTextAlignment(5);
                    setGravity(8388611);
                    iBr = ((asxe) agevVar.e(s)).br() - 1;
                    if (iBr != 1) {
                        setGravity(8388611);
                    } else if (iBr != 2) {
                        setGravity(8388613);
                        setTextAlignment(1);
                    } else if (iBr != 3) {
                        setGravity(8388611);
                        setTextAlignment(5);
                    } else {
                        setGravity(1);
                        setTextAlignment(4);
                    }
                }
            } else {
                setTextAlignment(5);
                setGravity(8388611);
                iBr = ((asxe) agevVar.e(s)).br() - 1;
                if (iBr != 1) {
                    setGravity(8388611);
                } else if (iBr != 2) {
                    setGravity(8388613);
                    setTextAlignment(1);
                } else if (iBr != 3) {
                    setGravity(8388611);
                    setTextAlignment(5);
                } else {
                    setGravity(1);
                    setTextAlignment(4);
                }
            }
            atfx atfxVar18 = this.c;
            if (atfxVar != null) {
                setBackground(new ColorDrawable(0));
            } else {
                setBackground(new ColorDrawable(0));
            }
            if (z) {
                atfx atfxVar19 = this.c;
                if (atfxVar != null) {
                    setOnFocusChangeListener(this);
                } else {
                    setOnFocusChangeListener(this);
                }
                atfxVar3 = this.c;
                if (atfxVar == null) {
                    if (Memory.peekByte(atfxVar3.c + 11) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zIsFocused = isFocused();
                    boolean z19 = this.g;
                    this.g = z4;
                    if (zIsFocused) {
                        if (zIsFocused) {
                            oozVar = new ooz(this, 3);
                            handler = this.b;
                            if (handler != null) {
                                handler.post(oozVar);
                            } else {
                                post(oozVar);
                            }
                        }
                    } else if (zIsFocused) {
                        oozVar = new ooz(this, 3);
                        handler = this.b;
                        if (handler != null) {
                            handler.post(oozVar);
                        } else {
                            post(oozVar);
                        }
                    }
                } else {
                    if (Memory.peekByte(atfxVar.c + 11) == 0) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Memory.peekByte(atfxVar3.c + 11) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z9 != z10) {
                        if (Memory.peekByte(atfxVar3.c + 11) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zIsFocused = isFocused();
                        boolean z110 = this.g;
                        this.g = z4;
                        if (zIsFocused) {
                            if (zIsFocused) {
                                oozVar = new ooz(this, 3);
                                handler = this.b;
                                if (handler != null) {
                                    handler.post(oozVar);
                                } else {
                                    post(oozVar);
                                }
                            }
                        } else if (zIsFocused) {
                            oozVar = new ooz(this, 3);
                            handler = this.b;
                            if (handler != null) {
                                handler.post(oozVar);
                            } else {
                                post(oozVar);
                            }
                        }
                    }
                }
                atfxVar4 = this.c;
                if (atfxVar != null) {
                    j7 = atfxVar.c;
                    if (true != atfz.a) {
                        j8 = 56;
                    } else {
                        j8 = 32;
                    }
                    if (Memory.peekInt(j7 + j8, false) != Memory.peekInt(atfxVar4.c + j8, false)) {
                        long j112 = atfxVar4.c;
                        if (true != atfz.a) {
                            j6 = 56;
                        } else {
                            j6 = 32;
                        }
                        iPeekInt = Memory.peekInt(j112 + j6, false);
                        if (iPeekInt != 0) {
                            rpi.y(this, iPeekInt);
                            ColorStateList colorStateListValueOf5 = ColorStateList.valueOf(iPeekInt);
                            int i110 = bac.a;
                            setBackgroundTintList(colorStateListValueOf5);
                        }
                    }
                } else {
                    long j113 = atfxVar4.c;
                    if (true != atfz.a) {
                        j6 = 56;
                    } else {
                        j6 = 32;
                    }
                    iPeekInt = Memory.peekInt(j113 + j6, false);
                    if (iPeekInt != 0) {
                        rpi.y(this, iPeekInt);
                        ColorStateList colorStateListValueOf6 = ColorStateList.valueOf(iPeekInt);
                        int i111 = bac.a;
                        setBackgroundTintList(colorStateListValueOf6);
                    }
                }
                atfxVar5 = this.c;
                if (atfxVar == null) {
                    if (Memory.peekByte(atfxVar5.c + j2) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    setEnabled(!z5);
                } else {
                    if (Memory.peekByte(atfxVar.c + j2) == 0) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (Memory.peekByte(atfxVar5.c + j2) == 0) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (z7 != z8) {
                        if (Memory.peekByte(atfxVar5.c + j2) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        setEnabled(!z5);
                    }
                }
                atfxVar6 = this.c;
                if (atfxVar != null) {
                    if ((Memory.peekByte(atfxVar.c + j) & 128) == 0) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    iPeekByte = Memory.peekByte(atfxVar6.c + j) & 128;
                    if (z6 == (iPeekByte != 0)) {
                        return;
                    }
                }
                atfxVar7 = this.c;
                if ((Memory.peekByte(atfxVar7.c + j) & 128) != 0) {
                    imeOptions = getImeOptions() & (-256);
                    iBa = atfxVar7.ba() - 1;
                    if (iBa == 1) {
                        imeOptions |= 2;
                    } else if (iBa == 2) {
                        imeOptions |= 3;
                    } else if (iBa == 3) {
                        imeOptions |= 4;
                    } else if (iBa == 4) {
                        imeOptions |= 5;
                    } else if (iBa == 5) {
                        imeOptions |= 6;
                    }
                    i(imeOptions);
                }
            }
        }
        z11 = true;
        z12 = z11;
        j9 = atfxVar15.c;
        if (z11 != atfz.a) {
            j10 = 40;
        } else {
            j10 = 20;
        }
        if (Memory.peekInt(j9 + j10, false) == z11) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (atfxVar15.aT()) {
            z14 = false;
        } else {
            z14 = false;
        }
        i4 = i14 | i13;
        if (z13) {
            if (z14) {
                i5 = (-131073) & i4;
                i(6);
                setOnEditorActionListener(this);
            } else if (this.x == null) {
                this.x = new oru(this, 0);
            }
            if (i5 != 0) {
                setRawInputType(i5);
            } else if (i4 != getInputType()) {
                setInputType(i4);
            }
            if (z3) {
                asxeVarBb = this.c.bb();
                if (asxeVarBb.bq() != 2) {
                    setEllipsize(owt.i(asxeVarBb.bq()));
                } else {
                    setEllipsize(null);
                }
                if (asxeVarBb.bq() == 1) {
                    iBs = asxeVarBb.bs() - 1;
                    int i112 = owt.c;
                    if (iBs == 1) {
                        truncateAt = TextUtils.TruncateAt.START;
                    } else if (iBs == 3) {
                        truncateAt = TextUtils.TruncateAt.MIDDLE;
                    } else if (iBs != 4) {
                        truncateAt = TextUtils.TruncateAt.END;
                    } else {
                        truncateAt = TextUtils.TruncateAt.MARQUEE;
                    }
                    setEllipsize(truncateAt);
                }
            }
            atfxVar2 = this.c;
            if (atfxVar != null) {
                zAV = atfxVar.aV();
                zAV2 = atfxVar2.aV();
                if (zAV == zAV2) {
                    setTextAlignment(5);
                    setGravity(8388611);
                    iBr = ((asxe) agevVar.e(s)).br() - 1;
                    if (iBr != 1) {
                        setGravity(8388611);
                    } else if (iBr != 2) {
                        setGravity(8388613);
                        setTextAlignment(1);
                    } else if (iBr != 3) {
                        setGravity(8388611);
                        setTextAlignment(5);
                    } else {
                        setGravity(1);
                        setTextAlignment(4);
                    }
                } else {
                    setTextAlignment(5);
                    setGravity(8388611);
                    iBr = ((asxe) agevVar.e(s)).br() - 1;
                    if (iBr != 1) {
                        setGravity(8388611);
                    } else if (iBr != 2) {
                        setGravity(8388613);
                        setTextAlignment(1);
                    } else if (iBr != 3) {
                        setGravity(8388611);
                        setTextAlignment(5);
                    } else {
                        setGravity(1);
                        setTextAlignment(4);
                    }
                }
            } else {
                setTextAlignment(5);
                setGravity(8388611);
                iBr = ((asxe) agevVar.e(s)).br() - 1;
                if (iBr != 1) {
                    setGravity(8388611);
                } else if (iBr != 2) {
                    setGravity(8388613);
                    setTextAlignment(1);
                } else if (iBr != 3) {
                    setGravity(8388611);
                    setTextAlignment(5);
                } else {
                    setGravity(1);
                    setTextAlignment(4);
                }
            }
            atfx atfxVar110 = this.c;
            if (atfxVar != null) {
                setBackground(new ColorDrawable(0));
            } else {
                setBackground(new ColorDrawable(0));
            }
            if (z) {
                atfx atfxVar111 = this.c;
                if (atfxVar != null) {
                    setOnFocusChangeListener(this);
                } else {
                    setOnFocusChangeListener(this);
                }
                atfxVar3 = this.c;
                if (atfxVar == null) {
                    if (Memory.peekByte(atfxVar3.c + 11) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zIsFocused = isFocused();
                    boolean z111 = this.g;
                    this.g = z4;
                    if (zIsFocused) {
                        if (zIsFocused) {
                            oozVar = new ooz(this, 3);
                            handler = this.b;
                            if (handler != null) {
                                handler.post(oozVar);
                            } else {
                                post(oozVar);
                            }
                        }
                    } else if (zIsFocused) {
                        oozVar = new ooz(this, 3);
                        handler = this.b;
                        if (handler != null) {
                            handler.post(oozVar);
                        } else {
                            post(oozVar);
                        }
                    }
                } else {
                    if (Memory.peekByte(atfxVar.c + 11) == 0) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (Memory.peekByte(atfxVar3.c + 11) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z9 != z10) {
                        if (Memory.peekByte(atfxVar3.c + 11) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zIsFocused = isFocused();
                        boolean z112 = this.g;
                        this.g = z4;
                        if (zIsFocused) {
                            if (zIsFocused) {
                                oozVar = new ooz(this, 3);
                                handler = this.b;
                                if (handler != null) {
                                    handler.post(oozVar);
                                } else {
                                    post(oozVar);
                                }
                            }
                        } else if (zIsFocused) {
                            oozVar = new ooz(this, 3);
                            handler = this.b;
                            if (handler != null) {
                                handler.post(oozVar);
                            } else {
                                post(oozVar);
                            }
                        }
                    }
                }
                atfxVar4 = this.c;
                if (atfxVar != null) {
                    j7 = atfxVar.c;
                    if (true != atfz.a) {
                        j8 = 56;
                    } else {
                        j8 = 32;
                    }
                    if (Memory.peekInt(j7 + j8, false) != Memory.peekInt(atfxVar4.c + j8, false)) {
                        long j114 = atfxVar4.c;
                        if (true != atfz.a) {
                            j6 = 56;
                        } else {
                            j6 = 32;
                        }
                        iPeekInt = Memory.peekInt(j114 + j6, false);
                        if (iPeekInt != 0) {
                            rpi.y(this, iPeekInt);
                            ColorStateList colorStateListValueOf7 = ColorStateList.valueOf(iPeekInt);
                            int i113 = bac.a;
                            setBackgroundTintList(colorStateListValueOf7);
                        }
                    }
                } else {
                    long j115 = atfxVar4.c;
                    if (true != atfz.a) {
                        j6 = 56;
                    } else {
                        j6 = 32;
                    }
                    iPeekInt = Memory.peekInt(j115 + j6, false);
                    if (iPeekInt != 0) {
                        rpi.y(this, iPeekInt);
                        ColorStateList colorStateListValueOf8 = ColorStateList.valueOf(iPeekInt);
                        int i114 = bac.a;
                        setBackgroundTintList(colorStateListValueOf8);
                    }
                }
                atfxVar5 = this.c;
                if (atfxVar == null) {
                    if (Memory.peekByte(atfxVar5.c + j2) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    setEnabled(!z5);
                } else {
                    if (Memory.peekByte(atfxVar.c + j2) == 0) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (Memory.peekByte(atfxVar5.c + j2) == 0) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (z7 != z8) {
                        if (Memory.peekByte(atfxVar5.c + j2) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        setEnabled(!z5);
                    }
                }
                atfxVar6 = this.c;
                if (atfxVar != null) {
                    if ((Memory.peekByte(atfxVar.c + j) & 128) == 0) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    iPeekByte = Memory.peekByte(atfxVar6.c + j) & 128;
                    if (z6 == (iPeekByte != 0)) {
                        return;
                    }
                }
                atfxVar7 = this.c;
                if ((Memory.peekByte(atfxVar7.c + j) & 128) != 0) {
                    imeOptions = getImeOptions() & (-256);
                    iBa = atfxVar7.ba() - 1;
                    if (iBa == 1) {
                        imeOptions |= 2;
                    } else if (iBa == 2) {
                        imeOptions |= 3;
                    } else if (iBa == 3) {
                        imeOptions |= 4;
                    } else if (iBa == 4) {
                        imeOptions |= 5;
                    } else if (iBa == 5) {
                        imeOptions |= 6;
                    }
                    i(imeOptions);
                }
            }
        }
        setOnEditorActionListener(this);
        i5 = 0;
        if (i5 != 0) {
            setRawInputType(i5);
        } else if (i4 != getInputType()) {
            setInputType(i4);
        }
        if (z3) {
            asxeVarBb = this.c.bb();
            if (asxeVarBb.bq() != 2) {
                setEllipsize(owt.i(asxeVarBb.bq()));
            } else {
                setEllipsize(null);
            }
            if (asxeVarBb.bq() == 1) {
                iBs = asxeVarBb.bs() - 1;
                int i115 = owt.c;
                if (iBs == 1) {
                    truncateAt = TextUtils.TruncateAt.START;
                } else if (iBs == 3) {
                    truncateAt = TextUtils.TruncateAt.MIDDLE;
                } else if (iBs != 4) {
                    truncateAt = TextUtils.TruncateAt.END;
                } else {
                    truncateAt = TextUtils.TruncateAt.MARQUEE;
                }
                setEllipsize(truncateAt);
            }
        }
        atfxVar2 = this.c;
        if (atfxVar != null) {
            zAV = atfxVar.aV();
            zAV2 = atfxVar2.aV();
            if (zAV == zAV2) {
                setTextAlignment(5);
                setGravity(8388611);
                iBr = ((asxe) agevVar.e(s)).br() - 1;
                if (iBr != 1) {
                    setGravity(8388611);
                } else if (iBr != 2) {
                    setGravity(8388613);
                    setTextAlignment(1);
                } else if (iBr != 3) {
                    setGravity(8388611);
                    setTextAlignment(5);
                } else {
                    setGravity(1);
                    setTextAlignment(4);
                }
            } else {
                setTextAlignment(5);
                setGravity(8388611);
                iBr = ((asxe) agevVar.e(s)).br() - 1;
                if (iBr != 1) {
                    setGravity(8388611);
                } else if (iBr != 2) {
                    setGravity(8388613);
                    setTextAlignment(1);
                } else if (iBr != 3) {
                    setGravity(8388611);
                    setTextAlignment(5);
                } else {
                    setGravity(1);
                    setTextAlignment(4);
                }
            }
        } else {
            setTextAlignment(5);
            setGravity(8388611);
            iBr = ((asxe) agevVar.e(s)).br() - 1;
            if (iBr != 1) {
                setGravity(8388611);
            } else if (iBr != 2) {
                setGravity(8388613);
                setTextAlignment(1);
            } else if (iBr != 3) {
                setGravity(8388611);
                setTextAlignment(5);
            } else {
                setGravity(1);
                setTextAlignment(4);
            }
        }
        atfx atfxVar112 = this.c;
        if (atfxVar != null) {
            setBackground(new ColorDrawable(0));
        } else {
            setBackground(new ColorDrawable(0));
        }
        if (z) {
            atfx atfxVar113 = this.c;
            if (atfxVar != null) {
                setOnFocusChangeListener(this);
            } else {
                setOnFocusChangeListener(this);
            }
            atfxVar3 = this.c;
            if (atfxVar == null) {
                if (Memory.peekByte(atfxVar3.c + 11) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zIsFocused = isFocused();
                boolean z113 = this.g;
                this.g = z4;
                if (zIsFocused) {
                    if (zIsFocused) {
                        oozVar = new ooz(this, 3);
                        handler = this.b;
                        if (handler != null) {
                            handler.post(oozVar);
                        } else {
                            post(oozVar);
                        }
                    }
                } else if (zIsFocused) {
                    oozVar = new ooz(this, 3);
                    handler = this.b;
                    if (handler != null) {
                        handler.post(oozVar);
                    } else {
                        post(oozVar);
                    }
                }
            } else {
                if (Memory.peekByte(atfxVar.c + 11) == 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (Memory.peekByte(atfxVar3.c + 11) == 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z9 != z10) {
                    if (Memory.peekByte(atfxVar3.c + 11) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zIsFocused = isFocused();
                    boolean z114 = this.g;
                    this.g = z4;
                    if (zIsFocused) {
                        if (zIsFocused) {
                            oozVar = new ooz(this, 3);
                            handler = this.b;
                            if (handler != null) {
                                handler.post(oozVar);
                            } else {
                                post(oozVar);
                            }
                        }
                    } else if (zIsFocused) {
                        oozVar = new ooz(this, 3);
                        handler = this.b;
                        if (handler != null) {
                            handler.post(oozVar);
                        } else {
                            post(oozVar);
                        }
                    }
                }
            }
            atfxVar4 = this.c;
            if (atfxVar != null) {
                j7 = atfxVar.c;
                if (true != atfz.a) {
                    j8 = 56;
                } else {
                    j8 = 32;
                }
                if (Memory.peekInt(j7 + j8, false) != Memory.peekInt(atfxVar4.c + j8, false)) {
                    long j116 = atfxVar4.c;
                    if (true != atfz.a) {
                        j6 = 56;
                    } else {
                        j6 = 32;
                    }
                    iPeekInt = Memory.peekInt(j116 + j6, false);
                    if (iPeekInt != 0) {
                        rpi.y(this, iPeekInt);
                        ColorStateList colorStateListValueOf9 = ColorStateList.valueOf(iPeekInt);
                        int i116 = bac.a;
                        setBackgroundTintList(colorStateListValueOf9);
                    }
                }
            } else {
                long j117 = atfxVar4.c;
                if (true != atfz.a) {
                    j6 = 56;
                } else {
                    j6 = 32;
                }
                iPeekInt = Memory.peekInt(j117 + j6, false);
                if (iPeekInt != 0) {
                    rpi.y(this, iPeekInt);
                    ColorStateList colorStateListValueOf10 = ColorStateList.valueOf(iPeekInt);
                    int i117 = bac.a;
                    setBackgroundTintList(colorStateListValueOf10);
                }
            }
            atfxVar5 = this.c;
            if (atfxVar == null) {
                if (Memory.peekByte(atfxVar5.c + j2) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                setEnabled(!z5);
            } else {
                if (Memory.peekByte(atfxVar.c + j2) == 0) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (Memory.peekByte(atfxVar5.c + j2) == 0) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (z7 != z8) {
                    if (Memory.peekByte(atfxVar5.c + j2) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    setEnabled(!z5);
                }
            }
            atfxVar6 = this.c;
            if (atfxVar != null) {
                if ((Memory.peekByte(atfxVar.c + j) & 128) == 0) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                iPeekByte = Memory.peekByte(atfxVar6.c + j) & 128;
                if (z6 == (iPeekByte != 0)) {
                    return;
                }
            }
            atfxVar7 = this.c;
            if ((Memory.peekByte(atfxVar7.c + j) & 128) != 0) {
                imeOptions = getImeOptions() & (-256);
                iBa = atfxVar7.ba() - 1;
                if (iBa == 1) {
                    imeOptions |= 2;
                } else if (iBa == 2) {
                    imeOptions |= 3;
                } else if (iBa == 3) {
                    imeOptions |= 4;
                } else if (iBa == 4) {
                    imeOptions |= 5;
                } else if (iBa == 5) {
                    imeOptions |= 6;
                }
                i(imeOptions);
            }
        }
    }

    public final void b() {
        Editable text;
        if (!this.c.aT() || (text = getText()) == null) {
            return;
        }
        this.y.l().d(this.c.aX(), k(j(text.toString(), this), this, 21));
    }

    public final void c(CharSequence charSequence) {
        atfx atfxVar = this.c;
        if (atfxVar != null) {
            if (atfxVar.g == null && (Memory.peekByte(atfxVar.c + 8) & 16) == 0) {
                return;
            }
            orq orqVarL = this.y.l();
            mew mewVarJ = j(charSequence.toString(), this);
            atfx atfxVar2 = this.c;
            if (atfxVar2.g == null && (Memory.peekByte(atfxVar2.c + 8) & 16) != 0) {
                atfxVar2.g = new mew(atfxVar2.cp(true != atfz.a ? 32 : 80, atcm.a));
            }
            orqVarL.d(atfxVar2.g == null ? atcl.a : atfxVar2.g, k(mewVarJ, this, 0));
        }
    }

    public final void d(atfx atfxVar, boolean z) {
        if (!z) {
            this.e.clear();
            this.g = false;
        }
        this.c = atfxVar;
        agev agevVarI = atfxVar.aV() ? agev.i(atfxVar.bc()) : agdf.a;
        this.m = Memory.peekInt(atfxVar.c + (true != atfz.a ? 64L : 40L), false);
        f();
        a(null, agevVarI, z);
        e(agevVarI);
    }

    final void e(agev agevVar) {
        ElementsServices elementsServices = this.y;
        Context contextC = elementsServices.c();
        DisplayMetrics displayMetricsE = elementsServices.e();
        asxe asxeVar = (asxe) agevVar.e(s);
        orq orqVarL = elementsServices.l();
        owu owuVar = this.z;
        CharSequence charSequenceP = owt.p(contextC, displayMetricsE, asxeVar, orqVarL, owuVar.a, elementsServices.n(), owuVar.c, null, owuVar.d);
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        this.f = true;
        try {
            beginBatchEdit();
            setText(charSequenceP, TextView.BufferType.EDITABLE);
            g(selectionStart, selectionEnd);
            endBatchEdit();
        } finally {
            this.f = false;
        }
    }

    public final void f() {
        InputFilter[] filters = getFilters();
        ArrayList arrayList = new ArrayList();
        if (filters != null) {
            for (InputFilter inputFilter : filters) {
                if (inputFilter != null && inputFilter.getClass().getName().contains("EmojiInputFilter")) {
                    arrayList.add(inputFilter);
                }
            }
        }
        if (this.q) {
            arrayList.add(w);
        }
        if (this.m > 0) {
            arrayList.add(this.A);
        }
        setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
    }

    public final void g(int i, int i2) {
        Editable text;
        if (i < 0 || i2 < 0 || (text = getText()) == null) {
            return;
        }
        int length = text.length();
        setSelection(Math.min(i, length), Math.min(i2, length));
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextWatcher textWatcher = this.x;
        if (textWatcher != null) {
            addTextChangedListener(textWatcher);
        }
        atfx atfxVar = this.c;
        if (atfxVar == null || Memory.peekByte(atfxVar.c + 13) == 0) {
            return;
        }
        orx orxVar = new orx(0);
        this.l = orxVar;
        orxVar.b(this);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TextWatcher textWatcher = this.x;
        if (textWatcher != null) {
            removeTextChangedListener(textWatcher);
        }
        orx orxVar = this.l;
        if (orxVar != null) {
            orxVar.d();
            this.l = null;
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (this.c.aT()) {
            b();
            return true;
        }
        if (i != 6) {
            return false;
        }
        clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return true;
        }
        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        return true;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        orx orxVar = this.l;
        if (orxVar != null) {
            if (z) {
                this.b.post(new ooz(this, 4));
                this.l.b(this);
            } else {
                orxVar.d();
            }
        }
        atfx atfxVar = this.c;
        if (z) {
            if (atfxVar.aS()) {
                orq orqVarL = this.y.l();
                mew mewVarJ = j(getText().toString(), this);
                atfx atfxVar2 = this.c;
                if (atfxVar2.e == null && (Memory.peekByte(atfxVar2.c + 8) & 4) != 0) {
                    atfxVar2.e = new mew(atfxVar2.cp(true != atfz.a ? 24 : 64, atcm.a));
                }
                orqVarL.d(atfxVar2.e == null ? atcl.a : atfxVar2.e, k(mewVarJ, this, 19));
                return;
            }
            return;
        }
        if (atfxVar.aR()) {
            orq orqVarL2 = this.y.l();
            mew mewVarJ2 = j(getText().toString(), this);
            atfx atfxVar3 = this.c;
            if (atfxVar3.f == null && (Memory.peekByte(atfxVar3.c + 8) & 8) != 0) {
                atfxVar3.f = new mew(atfxVar3.cp(true != atfz.a ? 28 : 72, atcm.a));
            }
            orqVarL2.d(atfxVar3.f == null ? atcl.a : atfxVar3.f, k(mewVarJ2, this, 19));
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.m <= 0 || getLineCount() <= this.m) {
            return;
        }
        h();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.j = i;
        this.k = i2;
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        List list = this.e;
        if (list != null) {
            String string = charSequence.toString();
            if (list.size() == 50) {
                list.remove(49);
            }
            list.add(0, string);
        }
        if (this.f) {
            return;
        }
        if (charSequence.length() == 0 && i == 0 && i2 == 0 && i3 == 0) {
            return;
        }
        String str = this.p;
        Editable text = getText();
        if (this.m <= 0 || str == null || text == null || !str.contentEquals(text)) {
            if (this.m > 0 && getLineCount() > this.m) {
                h();
                return;
            }
            atfx atfxVar = this.c;
            if (atfxVar != null && atfxVar.aV() && this.c.bc().bi().contentEquals(charSequence)) {
                return;
            }
            c(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000d  */
    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
            if (!drawable.getPadding(u)) {
                setPadding(0, 0, 0, 0);
            }
        } else {
            setPadding(0, 0, 0, 0);
        }
        super.setBackground(drawable);
    }
}
