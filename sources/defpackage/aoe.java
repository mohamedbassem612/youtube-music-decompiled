package defpackage;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aoe extends ViewGroup implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, bnu {
    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        throw null;
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        throw null;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        throw null;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        throw null;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        throw null;
    }

    @Override // android.view.View
    public final int getImportantForAutofill() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        throw null;
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        throw null;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        throw null;
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
        throw null;
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        throw null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        throw null;
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        throw null;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        throw null;
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        throw null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        throw null;
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
        throw null;
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        throw null;
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        throw null;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        throw null;
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        throw null;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        throw null;
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
        throw null;
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        throw null;
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        throw null;
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        throw null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw null;
    }
}
