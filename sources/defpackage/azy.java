package defpackage;

import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azy {
    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    static CharSequence b(View view) {
        return view.getStateDescription();
    }

    static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static void d(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof ayu) {
            ((ayu) viewParent).d(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.bV(viewParent, "ViewParent ", " does not implement interface method onNestedPreScroll"), e);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof ayv) {
            ((ayv) viewParent).f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof ayu) {
            ((ayu) viewParent).e(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.bV(viewParent, "ViewParent ", " does not implement interface method onNestedScroll"), e);
            }
        }
    }

    public static void f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof ayu) {
            ((ayu) viewParent).g(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.bV(viewParent, "ViewParent ", " does not implement interface method onNestedScrollAccepted"), e);
            }
        }
    }

    public static void g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof ayu) {
            ((ayu) viewParent).h(view, i);
        } else if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.bV(viewParent, "ViewParent ", " does not implement interface method onStopNestedScroll"), e);
            }
        }
    }

    public static boolean h(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.bV(viewParent, "ViewParent ", " does not implement interface method onNestedFling"), e);
            return false;
        }
    }

    public static boolean i(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.bV(viewParent, "ViewParent ", " does not implement interface method onNestedPreFling"), e);
            return false;
        }
    }

    public static boolean j(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof ayu) {
            return ((ayu) viewParent).t(view, view2, i, i2);
        }
        if (i2 == 0) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.bV(viewParent, "ViewParent ", " does not implement interface method onStartNestedScroll"), e);
            }
        }
        return false;
    }

    public static void k(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            bvx.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0076 A[SYNTHETIC] */
    public static void l(ByteBuffer byteBuffer, boolean z) {
        int iM;
        int i;
        int i2;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        if (iLimit - iPosition >= 4) {
            while (iPosition < iLimit) {
                int iM2 = m(byteBuffer, iPosition, iLimit);
                if (iM2 == iLimit || (iM = iM2 + 3) >= iLimit || (i = (byteBuffer.get(iM) & 126) >> 1) <= 31) {
                    return;
                }
                if (i == 39) {
                    int i3 = iM2 + 5;
                    iM = m(byteBuffer, i3, iLimit);
                    int i4 = 0;
                    while (i3 < iM) {
                        int i5 = 0;
                        while (true) {
                            if (i3 >= iM) {
                                i4 = i4;
                                i2 = -1;
                                break;
                            }
                            int i6 = i3 + 1;
                            int i7 = byteBuffer.get(i3) & 255;
                            if (i7 != 3) {
                                if (i7 == 0) {
                                    i4++;
                                } else {
                                    i4 = 0;
                                }
                                i5 += i7;
                                if (i7 != 255) {
                                    if (i5 == 4) {
                                        i2 = i3;
                                    } else {
                                        i2 = -1;
                                    }
                                    i3 = i6;
                                    break;
                                }
                            } else if (i4 >= 2) {
                                i4 = 0;
                            } else {
                                i7 = 3;
                                if (i7 == 0) {
                                    i4++;
                                } else {
                                    i4 = 0;
                                }
                                i5 += i7;
                                if (i7 != 255) {
                                    if (i5 == 4) {
                                        i2 = i3;
                                    } else {
                                        i2 = -1;
                                    }
                                    i3 = i6;
                                    break;
                                }
                            }
                            i3 = i6;
                        }
                        if (i3 >= iM) {
                            if (i2 == -1) {
                                break;
                            }
                            byteBuffer.put(i2, (byte) -2);
                            break;
                        }
                        int i8 = 0;
                        while (i3 < iM) {
                            int i9 = i3 + 1;
                            int i10 = byteBuffer.get(i3) & 255;
                            if (i10 != 3) {
                                if (i10 == 0) {
                                    i4++;
                                } else {
                                    i4 = 0;
                                }
                                i8 += i10;
                                if (i10 != 255) {
                                    i3 = i9;
                                    break;
                                }
                            } else if (i4 >= 2) {
                                i4 = 0;
                            } else {
                                i10 = 3;
                                if (i10 == 0) {
                                    i4++;
                                } else {
                                    i4 = 0;
                                }
                                i8 += i10;
                                if (i10 != 255) {
                                    i3 = i9;
                                    break;
                                }
                            }
                            i3 = i9;
                        }
                        if (i2 != -1 && (!z || !bvf.j(byteBuffer, i3, Math.min(i3 + i8, iM)))) {
                            byteBuffer.put(i2, (byte) -2);
                        }
                        i4 = i4;
                        int i11 = 0;
                        while (i11 < i8 && i3 < iM) {
                            int i12 = i3 + 1;
                            int i13 = byteBuffer.get(i3) & 255;
                            if (i13 != 3) {
                                if (i13 == 0) {
                                    i4++;
                                }
                                i11++;
                                i3 = i12;
                            } else if (i4 >= 2) {
                                i11--;
                            }
                            i4 = 0;
                            i11++;
                            i3 = i12;
                        }
                    }
                }
                iPosition = iM;
            }
        }
    }

    private static int m(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            int i4 = byteBuffer.get(i) & 255;
            if (i3 >= 2 && i4 == 1) {
                return i - 2;
            }
            i3 = i4 == 0 ? i3 + 1 : 0;
            i++;
        }
        return i2;
    }
}
