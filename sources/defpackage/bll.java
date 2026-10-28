package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bll {
    private static final Object k = new Object();
    private static volatile bll l;
    public final ReadWriteLock a;
    public final Set b;
    public int c;
    public final Handler d;
    public final bli e;
    public final boolean f;
    final boolean g;
    final int[] h;
    public final blk i;
    final bls j;

    private bll(blj bljVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        this.f = bljVar.a;
        this.g = bljVar.b;
        this.h = bljVar.c;
        this.j = bljVar.f;
        this.i = bljVar.e;
        this.d = new Handler(Looper.getMainLooper());
        afx afxVar = new afx(0);
        this.b = afxVar;
        Set set = bljVar.d;
        if (set != null && !set.isEmpty()) {
            afxVar.addAll(set);
        }
        bli bliVar = new bli(this);
        this.e = bliVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.c = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (a() == 0) {
                try {
                    qcb qcbVar = new qcb(bliVar);
                    bls blsVar = bliVar.a.j;
                    synchronized (blsVar.a) {
                        try {
                            if (blsVar.b == null) {
                                blsVar.c = new HandlerThread("emojiCompat", 10);
                                blsVar.c.start();
                                blsVar.b = new Handler(blsVar.c.getLooper());
                            }
                            blsVar.b.post(new blq(blsVar, qcbVar, 0, (char[]) null));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable unused) {
                    bliVar.a.g();
                }
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public static bll b() {
        bll bllVar;
        synchronized (k) {
            azs.h(l != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            bllVar = l;
        }
        return bllVar;
    }

    public static void e(blj bljVar) {
        if (l == null) {
            synchronized (k) {
                if (l == null) {
                    l = new bll(bljVar);
                }
            }
        }
        bll bllVar = l;
    }

    public final int a() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        return f(charSequence, 0, charSequence == null ? 0 : charSequence.length(), Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final boolean d() {
        return a() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:26:0x0062, B:33:0x0080, B:35:0x008a, B:39:0x0090, B:41:0x009c, B:42:0x009f, B:44:0x00ac, B:49:0x00b9, B:50:0x00c7, B:54:0x00e6, B:59:0x00f1, B:62:0x00fd, B:63:0x0102, B:64:0x010c, B:66:0x0113, B:67:0x0118, B:69:0x0123, B:71:0x0129, B:75:0x0133, B:78:0x013f, B:79:0x0145, B:24:0x005e, B:27:0x0066, B:29:0x006a, B:31:0x0079), top: B:92:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009c A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:26:0x0062, B:33:0x0080, B:35:0x008a, B:39:0x0090, B:41:0x009c, B:42:0x009f, B:44:0x00ac, B:49:0x00b9, B:50:0x00c7, B:54:0x00e6, B:59:0x00f1, B:62:0x00fd, B:63:0x0102, B:64:0x010c, B:66:0x0113, B:67:0x0118, B:69:0x0123, B:71:0x0129, B:75:0x0133, B:78:0x013f, B:79:0x0145, B:24:0x005e, B:27:0x0066, B:29:0x006a, B:31:0x0079), top: B:92:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x015a A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:96:0x009f A[SYNTHETIC] */
    public final CharSequence f(CharSequence charSequence, int i, int i2, int i3) {
        int iCharCount;
        blp[] blpVarArr;
        int i4;
        int spanStart;
        azs.h(d(), "Not initialized yet");
        azs.k(i, "start cannot be negative");
        azs.k(i2, "end cannot be negative");
        azs.k(i3, "maxEmojiCount cannot be negative");
        azs.f(i <= i2, "start should be <= than end");
        Spannable spannableString = null;
        if (charSequence == null) {
            return null;
        }
        azs.f(i <= charSequence.length(), "start should be < than charSequence length");
        azs.f(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = this.f;
        boolean z2 = charSequence instanceof bmd;
        eqf eqfVar = this.e.b;
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, blp.class) <= i2) {
                        spannableString = new SpannableString(charSequence);
                    }
                }
                if (spannableString != null && (blpVarArr = (blp[]) spannableString.getSpans(i, i2, blp.class)) != null && (blpVarArr.length) > 0) {
                    for (blp blpVar : blpVarArr) {
                        spanStart = spannableString.getSpanStart(blpVar);
                        int spanEnd = spannableString.getSpanEnd(blpVar);
                        if (spanStart != i2) {
                            spannableString.removeSpan(blpVar);
                        }
                        i = Math.min(spanStart, i);
                        i2 = Math.max(spanEnd, i2);
                    }
                }
                if (i != i2 || i >= charSequence.length()) {
                    if (z2) {
                        return charSequence;
                    }
                    return charSequence;
                }
                if (i3 != Integer.MAX_VALUE && spannableString != null) {
                    i3 -= ((blp[]) spannableString.getSpans(0, spannableString.length(), blp.class)).length;
                }
                blo bloVar = new blo((zg) ((dep) eqfVar.c).b, eqfVar.a, (int[]) eqfVar.d);
                int iCodePointAt = Character.codePointAt(charSequence, i);
                Spannable spannableString2 = spannableString;
                int i5 = 0;
                loop1: while (true) {
                    iCharCount = i;
                    while (true) {
                        if (i >= i2 || i5 >= i3) {
                            break loop1;
                        }
                        int iA = bloVar.a(iCodePointAt);
                        if (iA == 1) {
                            iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                            if (iCharCount < i2) {
                                iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                            }
                            i = iCharCount;
                        } else {
                            if (iA != 2) {
                                break;
                            }
                            i += Character.charCount(iCodePointAt);
                            if (i < i2) {
                                iCodePointAt = Character.codePointAt(charSequence, i);
                            }
                        }
                    }
                    if (z || !eqfVar.g(charSequence, iCharCount, i, bloVar.c())) {
                        if (spannableString2 == null) {
                            spannableString2 = new SpannableString(charSequence);
                        }
                        eqf.h(spannableString2, bloVar.c(), iCharCount, i);
                        i5++;
                    }
                }
                CharSequence charSequence2 = spannableString2;
                charSequence2 = spannableString2;
                if (bloVar.d() && i5 < i3 && (z || !eqfVar.g(charSequence, iCharCount, i, bloVar.b()))) {
                    if (spannableString2 == null) {
                        spannableString2 = new SpannableString(charSequence);
                    }
                    eqf.h(spannableString2, bloVar.b(), iCharCount, i);
                    charSequence2 = spannableString2;
                }
                if (charSequence2 == null) {
                    charSequence2 = charSequence;
                }
                return charSequence2;
            } finally {
                if (z2) {
                    ((bmd) charSequence).b();
                }
            }
        }
        ((bmd) charSequence).a();
        spannableString = (Spannable) charSequence;
        if (spannableString != null) {
            while (i4 < r6) {
                spanStart = spannableString.getSpanStart(blpVar);
                int spanEnd2 = spannableString.getSpanEnd(blpVar);
                if (spanStart != i2) {
                    spannableString.removeSpan(blpVar);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd2, i2);
            }
        }
        if (i != i2) {
        }
        if (z2) {
            return charSequence;
        }
        return charSequence;
    }

    final void g() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            Set set = this.b;
            arrayList.addAll(set);
            set.clear();
            this.a.writeLock().unlock();
            this.d.post(new duz(arrayList, this.c, 1));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void h(ato atoVar) {
        azs.m(atoVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            int i = this.c;
            if (i == 1 || i == 2) {
                Handler handler = this.d;
                azs.m(atoVar, "initCallback cannot be null");
                handler.post(new duz(Arrays.asList(atoVar), i, 1));
            } else {
                this.b.add(atoVar);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void i(ato atoVar) {
        this.a.writeLock().lock();
        try {
            this.b.remove(atoVar);
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
