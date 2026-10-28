package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class wn implements boq {
    private final /* synthetic */ int $cid;
    final /* synthetic */ wo a;

    public wn(wo woVar, int i) {
        this.$cid = i;
        this.a = woVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[PHI: r5
      0x0039: PHI (r5v3 int) = (r5v2 int), (r5v10 int) binds: [B:10:0x0032, B:12:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[PHI: r5
      0x0044: PHI (r5v4 int) = (r5v3 int), (r5v8 int) binds: [B:15:0x003a, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    @Override // defpackage.boq
    public final /* synthetic */ void a(Object obj) {
        int i;
        if (this.$cid == 0) {
            CharSequence charSequence = (CharSequence) obj;
            wo woVar = this.a;
            Handler handler = woVar.k;
            Runnable runnable = woVar.l;
            handler.removeCallbacks(runnable);
            TextView textView = woVar.q;
            if (textView != null) {
                textView.setText(charSequence);
            }
            handler.postDelayed(runnable, 2000L);
            return;
        }
        Integer num = (Integer) obj;
        wo woVar2 = this.a;
        Handler handler2 = woVar2.k;
        Runnable runnable2 = woVar2.l;
        handler2.removeCallbacks(runnable2);
        int iIntValue = num.intValue();
        if (woVar2.p != null) {
            int i2 = woVar2.m.w;
            Context context = woVar2.getContext();
            Drawable drawable = null;
            int i3 = 0;
            if (context == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i4 = R.drawable.fingerprint_dialog_fp_icon;
                if (i2 == 0) {
                    i2 = 0;
                    if (iIntValue == 1) {
                        iIntValue = 1;
                    } else {
                        i = i2;
                        if (i2 != 1) {
                            i = i2;
                            if (i2 == 2) {
                                if (iIntValue != 1) {
                                    i = 2;
                                }
                                i2 = i;
                            } else {
                                i = i2;
                            }
                            if (i2 == 1 || iIntValue != 3) {
                                i2 = i;
                            } else {
                                i2 = i;
                            }
                        } else {
                            if (iIntValue == 2) {
                                i4 = R.drawable.fingerprint_dialog_error;
                            } else {
                                i2 = 1;
                                i = i2;
                                if (i2 == 2) {
                                    i = i2;
                                } else if (iIntValue != 1) {
                                    i = 2;
                                }
                                if (i2 == 1) {
                                }
                                i2 = i;
                            }
                            i2 = i;
                        }
                    }
                    drawable = context.getDrawable(i4);
                } else {
                    i = i2;
                    if (i2 != 1) {
                        i = i2;
                        if (i2 == 2) {
                            if (iIntValue != 1) {
                                i = 2;
                            }
                            i2 = i;
                            drawable = context.getDrawable(i4);
                        } else {
                            i = i2;
                        }
                        if (i2 == 1) {
                        }
                        i2 = i;
                    } else {
                        if (iIntValue == 2) {
                            i4 = R.drawable.fingerprint_dialog_error;
                        } else {
                            i2 = 1;
                            i = i2;
                            if (i2 == 2) {
                                i = i2;
                            } else if (iIntValue != 1) {
                                i = 2;
                            }
                            if (i2 == 1) {
                            }
                            i2 = i;
                        }
                        i2 = i;
                        drawable = context.getDrawable(i4);
                    }
                }
            }
            if (drawable != null) {
                woVar2.p.setImageDrawable(drawable);
                if (i2 == 0) {
                    if (iIntValue != 1) {
                    }
                    woVar2.m.w = iIntValue;
                } else {
                    i3 = i2;
                }
                if (i3 != 1 ? !(i3 != 2 || iIntValue != 1) : iIntValue == 2) {
                    if (drawable instanceof AnimatedVectorDrawable) {
                        ((AnimatedVectorDrawable) drawable).start();
                    }
                }
                woVar2.m.w = iIntValue;
            }
        }
        int iIntValue2 = num.intValue();
        TextView textView2 = woVar2.q;
        if (textView2 != null) {
            textView2.setTextColor(iIntValue2 == 2 ? woVar2.n : woVar2.o);
        }
        handler2.postDelayed(runnable2, 2000L);
    }
}
