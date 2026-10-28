package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.libraries.jni.UnsafeMemory;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import j$.util.concurrent.ConcurrentMap;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oty {
    public static final /* synthetic */ int a = 0;
    private static final agfr b = aguu.al(new cln(7));

    static boolean a(Context context) {
        Context baseContext;
        if (context instanceof Activity) {
            return ((Activity) context).isDestroyed();
        }
        return (context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null && a(baseContext);
    }

    public static ImageView.ScaleType b(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i2 != 3) {
            return i2 != 4 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static void c(Drawable drawable, atiq atiqVar) {
        if (atiqVar.aS() == 0 || !atiqVar.aY(0).aS() || Memory.peekInt(atiqVar.aY(0).aU().c + 12, false) == 0) {
            return;
        }
        drawable.mutate().setColorFilter(Memory.peekInt(atiqVar.aY(0).aU().c + 12, false), PorterDuff.Mode.SRC_IN);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0237  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ea  */
    public static otx d(Context context, atiq atiqVar, atiq atiqVar2, atiq atiqVar3, kjc kjcVar, int i, int i2, boolean z) throws oot {
        otx otxVar;
        long j;
        long j2;
        long j3;
        otx otxVar2;
        ativ ativVarAY;
        ativ ativVarAY2;
        ativ ativVar;
        int i3;
        if (a(context)) {
            return null;
        }
        try {
            esq esqVarD = erj.d(context);
            if (a(context)) {
                return null;
            }
            int iAS = atiqVar.aS();
            long j4 = 20;
            boolean z2 = false;
            if (iAS != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 >= iAS) {
                        j = j4;
                        j2 = 103;
                        j3 = 21;
                        otxVar2 = null;
                        break;
                    }
                    j2 = 103;
                    ativ ativVarAY3 = atiqVar.aY(i4);
                    if (ativVarAY3.aT()) {
                        if (ativVarAY3.j == null) {
                            j3 = 21;
                            long j5 = ativVarAY3.c;
                            byte bPeekByte = Memory.peekByte(j5 + j4);
                            byte bPeekByte2 = Memory.peekByte(j5 + 21);
                            boolean z3 = UnsafeMemory.a;
                            byte b2 = true != z3 ? bPeekByte2 : bPeekByte;
                            if (true == z3) {
                                bPeekByte = bPeekByte2;
                            }
                            if (((short) ((b2 << 8) | (bPeekByte & 255))) == 6) {
                                ativVarAY3.j = new mew(ativVarAY3.cp(24, atil.a));
                            }
                        } else {
                            j3 = 21;
                        }
                        mew mewVar = ativVarAY3.j == null ? atik.a : ativVarAY3.j;
                        int iAD = ksy.aD(mewVar);
                        j = j4;
                        otz otzVar = (otz) ((aga) kjcVar.a).a(iAD);
                        if (otzVar == null) {
                            throw new oot(a.bR(iAD, "Unknown CustomImageSource extension: "));
                        }
                        mewVar.d(otzVar.a());
                        Object objB = otzVar.b();
                        if (objB != null) {
                            otxVar2 = new otx((Memory.peekByte(FlagServices.b().c + 103) == 0 || !(objB instanceof Drawable)) ? esqVarD.f(objB) : (esn) esqVarD.d((Drawable) objB).I(true), ativVarAY3);
                            break;
                        }
                    } else {
                        j = j4;
                    }
                    i4++;
                    j4 = j;
                }
            } else {
                otxVar2 = null;
                j = 20;
                j2 = 103;
                j3 = 21;
            }
            if (otxVar2 == null) {
                if (atiqVar.aS() == 0 && atiqVar.aU()) {
                    esn esnVarD = esqVarD.d(new BitmapDrawable(context.getResources(), Memory.peekByte(FlagServices.b().c + 38) != 0 ? (Bitmap) b.io() : Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8)));
                    if (Memory.peekByte(FlagServices.b().c + j2) != 0) {
                        esnVarD = (esn) esnVarD.I(true);
                    }
                    otxVar2 = new otx(esnVarD, null);
                } else {
                    otxVar2 = null;
                }
            }
            if (otxVar2 == null) {
                int iMax = Math.max(i, 0);
                int iMax2 = Math.max(i2, 0);
                if (atiqVar != null) {
                    ativVar = null;
                    if (atiqVar.aS() != 0) {
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < atiqVar.aS()) {
                            ativ ativVarAY4 = atiqVar.aY(i5);
                            if (ativVarAY4 != null) {
                                i3 = iMax;
                                try {
                                    long j6 = ativVarAY4.c;
                                    int iPeekInt = i3 - Memory.peekInt(j6 + 12, false);
                                    int iPeekInt2 = iMax2 - Memory.peekInt(j6 + 16, false);
                                    int i7 = (iPeekInt * iPeekInt) + (iPeekInt2 * iPeekInt2);
                                    if (ativVar == null || i7 < i6) {
                                        i6 = i7;
                                        ativVar = ativVarAY4;
                                    }
                                } catch (IllegalArgumentException unused) {
                                    otxVar = null;
                                    return otxVar;
                                }
                            } else {
                                i3 = iMax;
                            }
                            i5++;
                            iMax = i3;
                        }
                    }
                } else {
                    ativVar = null;
                }
                if (ativVar == null || TextUtils.isEmpty(ativVar.aR())) {
                    otxVar2 = null;
                } else {
                    Uri uriBuild = Uri.parse(ativVar.aR());
                    if (ahno.aa(uriBuild.getScheme())) {
                        uriBuild = uriBuild.buildUpon().scheme("https").build();
                    }
                    otxVar2 = new otx(esqVarD.c().f(uriBuild), ativVar);
                }
            }
            if (otxVar2 == null) {
                int iB = otk.b(context, atiqVar);
                if (iB != 0) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= atiqVar.aS()) {
                            ativVarAY2 = null;
                            break;
                        }
                        ativVarAY2 = atiqVar.aY(i8);
                        if (ativVarAY2.aS()) {
                            break;
                        }
                        i8++;
                    }
                    if (ativVarAY2 == null) {
                        otxVar2 = null;
                    } else {
                        otxVar2 = new otx(esqVarD.e(Integer.valueOf(iB)), ativVarAY2);
                    }
                } else {
                    otxVar2 = null;
                }
            }
            if (otxVar2 == null) {
                agev agevVarA = nup.a(atiqVar);
                if (agevVarA.g()) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= atiqVar.aS()) {
                            ativVarAY = null;
                            break;
                        }
                        ativVarAY = atiqVar.aY(i9);
                        long j7 = ativVarAY.c;
                        byte bPeekByte3 = Memory.peekByte(j7 + j);
                        byte bPeekByte4 = Memory.peekByte(j7 + j3);
                        boolean z4 = UnsafeMemory.a;
                        byte b3 = true != z4 ? bPeekByte4 : bPeekByte3;
                        if (true == z4) {
                            bPeekByte3 = bPeekByte4;
                        }
                        if (((short) ((b3 << 8) | (bPeekByte3 & 255))) == 2) {
                            break;
                        }
                        i9++;
                    }
                    if (ativVarAY == null) {
                        otxVar2 = null;
                    } else {
                        otxVar2 = new otx(esqVarD.g((byte[]) agevVarA.c()), ativVarAY);
                    }
                } else {
                    otxVar2 = null;
                }
            }
            if (otxVar2 == null) {
                if (atiqVar3 == null) {
                    return null;
                }
                otxVar = null;
                try {
                    otxVar2 = new otx(esqVarD.f(null), null);
                } catch (IllegalArgumentException unused2) {
                    return otxVar;
                }
            }
            esn esnVar = otxVar2.a;
            if (atiqVar.aX() == 5) {
                ativ ativVar2 = otxVar2.b;
                if (ativVar2 != null && ativVar2.aT()) {
                    z2 = true;
                }
                int iB2 = otk.b(context, atiqVar);
                if ((iB2 == 0 || !((Boolean) ConcurrentMap.EL.computeIfAbsent(otk.b, Integer.valueOf(iB2), new iuk(context, 13))).booleanValue()) && !z2) {
                    esnVar = (esn) esnVar.v(evs.c);
                }
                esnVar = (esn) esnVar.B(Integer.MIN_VALUE, Integer.MIN_VALUE);
            } else if (Memory.peekByte(FlagServices.b().c + 37) != 0 && atiqVar.aX() == 4) {
                esnVar = (esn) esnVar.x(fam.d);
            } else if (!z) {
                esnVar = (esn) esnVar.x(atiqVar.aX() + (-1) != 2 ? fam.d : fam.c);
            }
            if (atiqVar2 != null) {
                int iB3 = otk.b(context, atiqVar2);
                if (iB3 != 0) {
                    esnVar.C(iB3);
                } else {
                    Drawable drawableE = e(context, atiqVar2);
                    if (drawableE != null) {
                        esnVar.D(drawableE);
                    }
                }
            }
            if (atiqVar3 != null) {
                int iB4 = otk.b(context, atiqVar3);
                if (iB4 != 0) {
                    esnVar.y(iB4);
                } else {
                    Drawable drawableE2 = e(context, atiqVar3);
                    if (drawableE2 != null) {
                        esnVar.z(drawableE2);
                    }
                }
            }
            return otxVar2;
        } catch (IllegalArgumentException unused3) {
            otxVar = null;
        }
    }

    private static Drawable e(Context context, atiq atiqVar) {
        agev agevVarA = nup.a(atiqVar);
        if (agevVarA.g()) {
            byte[] bArr = (byte[]) agevVarA.c();
            return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        }
        if (Memory.peekByte(FlagServices.b().c + 38) != 0 && atiqVar.aS() == 0 && atiqVar.aU()) {
            return new BitmapDrawable(context.getResources(), (Bitmap) b.io());
        }
        return null;
    }
}
