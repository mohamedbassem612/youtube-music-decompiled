package com.google.android.libraries.multiplatform.elements.text.experimental;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.protos.youtube.elements.upb.TextTypeOuterClass$TextType;
import dalvik.annotation.optimization.CriticalNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class Paragraph {
    public final int a;
    public final UpbArena b;
    public long paragraphHandle;

    public Paragraph(long j, UpbArena upbArena) {
        this.paragraphHandle = j;
        this.b = upbArena;
        this.a = jniGetFlags(j);
    }

    public static Paragraph createFromTextType(TextTypeOuterClass$TextType textTypeOuterClass$TextType) {
        if (!textTypeOuterClass$TextType.aU()) {
            return null;
        }
        UpbMessage upbMessage = textTypeOuterClass$TextType.b;
        long j = upbMessage.c.a;
        long jJniCreateFromTextType = jniCreateFromTextType(upbMessage.a, j);
        if (jJniCreateFromTextType == 0 || j == 0) {
            return null;
        }
        UpbArena upbArena = !UpbArena.jniIncrementReferenceCount(j) ? null : new UpbArena(j);
        if (upbArena != null) {
            return new Paragraph(jJniCreateFromTextType, upbArena);
        }
        jniReleaseParagraph(jJniCreateFromTextType);
        return null;
    }

    @CriticalNative
    private static native long jniCreateFromTextType(long j, long j2);

    @CriticalNative
    public static native int jniGetAttachmentRunAlignment(long j, int i);

    @CriticalNative
    public static native int jniGetAttachmentRunCount(long j);

    @CriticalNative
    public static native long jniGetAttachmentRunElement(long j, int i);

    @CriticalNative
    public static native int jniGetAttachmentRunLength(long j, int i);

    @CriticalNative
    public static native int jniGetAttachmentRunStart(long j, int i);

    public static native String jniGetCommandRunAccessibilityLabel(long j, int i);

    @CriticalNative
    public static native int jniGetCommandRunCount(long j);

    @CriticalNative
    public static native int jniGetCommandRunLength(long j, int i);

    @CriticalNative
    public static native long jniGetCommandRunOnLongPress(long j, int i);

    @CriticalNative
    public static native long jniGetCommandRunOnTap(long j, int i);

    @CriticalNative
    public static native int jniGetCommandRunStart(long j, int i);

    @CriticalNative
    public static native int jniGetDecorationRunCount(long j);

    @CriticalNative
    public static native long jniGetDecorationRunDecoration(long j, int i);

    @CriticalNative
    public static native int jniGetDecorationRunLength(long j, int i);

    @CriticalNative
    public static native int jniGetDecorationRunStart(long j, int i);

    @CriticalNative
    public static native long jniGetFirstDynamicTextConfig(long j);

    @CriticalNative
    private static native int jniGetFlags(long j);

    @CriticalNative
    public static native int jniGetMetadataRunCount(long j);

    public static native String jniGetMetadataRunLanguageHint(long j, int i);

    @CriticalNative
    public static native int jniGetMetadataRunLength(long j, int i);

    @CriticalNative
    public static native int jniGetMetadataRunStart(long j, int i);

    @CriticalNative
    private static native int jniGetParagraphFontHandleId(long j);

    @CriticalNative
    public static native long jniGetParagraphHandle(long j);

    @CriticalNative
    private static native int jniGetParagraphStyleAlignment(long j);

    @CriticalNative
    private static native boolean jniGetParagraphStyleAndroidIncludeFontPadding(long j);

    @CriticalNative
    public static native int jniGetParagraphStyleFontColor(long j);

    @CriticalNative
    private static native boolean jniGetParagraphStyleHasFontColor(long j);

    @CriticalNative
    private static native boolean jniGetParagraphStyleLegacyCompatibilityMode(long j);

    @CriticalNative
    private static native int jniGetParagraphStyleLineBreakMode(long j);

    @CriticalNative
    public static native int jniGetParagraphStyleLineClamp(long j);

    @CriticalNative
    public static native int jniGetParagraphStyleLineHeightUnit(long j);

    @CriticalNative
    public static native float jniGetParagraphStyleLineHeightValue(long j);

    @CriticalNative
    private static native float jniGetParagraphStyleLineSpacing(long j);

    @CriticalNative
    private static native int jniGetParagraphStyleParagraphDirection(long j);

    @CriticalNative
    public static native int jniGetParagraphStyleRunCount(long j);

    @CriticalNative
    public static native int jniGetParagraphStyleRunLength(long j, int i);

    @CriticalNative
    public static native int jniGetParagraphStyleRunStart(long j, int i);

    @CriticalNative
    public static native long jniGetParagraphStyleRunStyle(long j, int i);

    @CriticalNative
    private static native int jniGetParagraphStyleTextWrapMode(long j);

    @CriticalNative
    public static native int jniGetParagraphStyleTextWrapStyle(long j);

    @CriticalNative
    public static native int jniGetParagraphStyleTruncationMode(long j);

    @CriticalNative
    public static native int jniGetSpanCount(long j);

    public static native String jniGetSpanFontFamily(long j, int i);

    @CriticalNative
    private static native long jniGetSpanFontHandle(long j, int i);

    @CriticalNative
    private static native int jniGetSpanFontHandleId(long j, int i);

    @CriticalNative
    public static native float jniGetSpanFontSize(long j, int i);

    @CriticalNative
    private static native int jniGetSpanFontStretch(long j, int i);

    public static native String jniGetSpanFontVariationSettings(long j, int i);

    @CriticalNative
    public static native int jniGetSpanFontWeight(long j, int i);

    @CriticalNative
    public static native boolean jniGetSpanItalic(long j, int i);

    @CriticalNative
    private static native int jniGetSpanLength(long j, int i);

    @CriticalNative
    private static native int jniGetSpanOffset(long j, int i);

    @CriticalNative
    private static native float jniGetSpanOpticalSize(long j, int i);

    @CriticalNative
    public static native int jniGetStyleRunExtensionRunCount(long j);

    @CriticalNative
    public static native long jniGetStyleRunExtensionRunExtensions(long j, int i);

    @CriticalNative
    public static native int jniGetStyleRunExtensionRunLength(long j, int i);

    @CriticalNative
    public static native int jniGetStyleRunExtensionRunStart(long j, int i);

    private static native String jniGetTextContent(long j);

    @CriticalNative
    public static native long jniGetTruncatedAlt(long j);

    @CriticalNative
    private static native boolean jniHasLayoutAlteringPartialStyleRun(long j);

    @CriticalNative
    private static native boolean jniHasTruncatedAlt(long j);

    @CriticalNative
    private static native boolean jniParagraphStyleHasLineHeight(long j);

    @CriticalNative
    public static native void jniReleaseParagraph(long j);

    @CriticalNative
    public static native int jniSpanGetBackgroundColor(long j, int i);

    @CriticalNative
    public static native float jniSpanGetBackgroundCornerRadius(long j, int i);

    @CriticalNative
    public static native int jniSpanGetBaselineOffset(long j, int i);

    @CriticalNative
    private static native int jniSpanGetFontColor(long j, int i);

    @CriticalNative
    public static native int jniSpanGetFontSizeUnit(long j, int i);

    @CriticalNative
    public static native float jniSpanGetLetterSpacing(long j, int i);

    @CriticalNative
    public static native int jniSpanGetStrikethrough(long j, int i);

    @CriticalNative
    public static native int jniSpanGetUnderline(long j, int i);

    @CriticalNative
    public static native boolean jniSpanHasBackgroundColor(long j, int i);

    @CriticalNative
    private static native boolean jniSpanHasFontColor(long j, int i);

    @CriticalNative
    private static native boolean jniUseStandardEllipsis(long j);

    public final float a() {
        if ((this.a & SemanticState.Obscured) == 0) {
            return 0.0f;
        }
        return jniGetParagraphStyleLineSpacing(this.paragraphHandle);
    }

    public final int b() {
        return jniGetParagraphFontHandleId(this.paragraphHandle);
    }

    public final int c() {
        return jniGetParagraphStyleAlignment(this.paragraphHandle);
    }

    public final int d() {
        if ((this.a & SemanticState.Multiline) == 0) {
            return 0;
        }
        return jniGetParagraphStyleLineBreakMode(this.paragraphHandle);
    }

    public final int e() {
        if ((this.a & 32768) == 0) {
            return 0;
        }
        return jniGetParagraphStyleParagraphDirection(this.paragraphHandle);
    }

    public final int f(int i) {
        return jniSpanGetFontColor(this.paragraphHandle, i);
    }

    public final int g(int i) {
        return jniGetSpanFontHandleId(this.paragraphHandle, i);
    }

    public final int h(int i) {
        return jniGetSpanLength(this.paragraphHandle, i);
    }

    public final int i(int i) {
        return jniGetSpanOffset(this.paragraphHandle, i);
    }

    public final String j() {
        return jniGetTextContent(this.paragraphHandle);
    }

    public final void k() {
        jniReleaseParagraph(this.paragraphHandle);
        this.paragraphHandle = 0L;
    }

    public final boolean l() {
        return (this.a & 524288) != 0;
    }

    public final boolean m() {
        return (this.a & SemanticState.Hidden) != 0;
    }

    public final boolean n(int i) {
        return jniSpanHasFontColor(this.paragraphHandle, i);
    }
}
