package app.rive.runtime.kotlin.controllers;

import android.graphics.RectF;
import app.rive.RiveLog;
import app.rive.runtime.kotlin.ChangedInput;
import app.rive.runtime.kotlin.Observable;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.core.AdvanceResult;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.Direction;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.LayerState;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.Loop;
import app.rive.runtime.kotlin.core.PlayableInstance;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RiveEvent;
import app.rive.runtime.kotlin.core.SMIBoolean;
import app.rive.runtime.kotlin.core.SMIInput;
import app.rive.runtime.kotlin.core.SMINumber;
import app.rive.runtime.kotlin.core.SMITrigger;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.ViewModelInstance;
import app.rive.runtime.kotlin.core.errors.ArtboardException;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.TextValueRunException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import app.rive.runtime.kotlin.renderers.PointerEvents;
import defpackage.atqq;
import defpackage.awmj;
import defpackage.awqx;
import defpackage.awrc;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveFileController implements Observable, RefCount {
    public static final String TAG = "RiveL/RiveFileController";
    private Set _eventListeners;
    private Set _listeners;
    private Artboard activeArtboard;
    private Alignment alignment;
    private List animationList;
    private boolean autoplay;
    private final ConcurrentLinkedQueue changedInputs;
    private File file;
    private Fit fit;
    private boolean isActive;
    private Float layoutScaleFactor;
    private float layoutScaleFactorAutomatic;
    private Loop loop;
    private Function0 onStart;
    private Set playingAnimationSet;
    private Set playingStateMachineSet;
    private AtomicInteger refs;
    private AtomicBoolean requireArtboardResize;
    private final ReentrantLock startStopLock;
    private List stateMachineList;
    private RectF targetBounds;
    private Float userSetVolume;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: PG */
    public interface RiveEventListener {
        void notifyEvent(RiveEvent riveEvent);
    }

    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdvanceResult.values().length];
            try {
                iArr[AdvanceResult.ONESHOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvanceResult.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvanceResult.PINGPONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvanceResult.ADVANCED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvanceResult.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PointerEvents.values().length];
            try {
                iArr2[PointerEvents.POINTER_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PointerEvents.POINTER_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PointerEvents.POINTER_MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PointerEvents.POINTER_EXIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RiveFileController(Loop loop, boolean z, File file, Artboard artboard, Function0 function0, ConcurrentLinkedQueue concurrentLinkedQueue) {
        loop.getClass();
        concurrentLinkedQueue.getClass();
        this.loop = loop;
        this.autoplay = z;
        this.onStart = function0;
        this.changedInputs = concurrentLinkedQueue;
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveFileController._init_$lambda$0();
            }
        });
        this.refs = new AtomicInteger(1);
        this.requireArtboardResize = new AtomicBoolean(false);
        this.fit = Fit.CONTAIN;
        this.alignment = Alignment.CENTER;
        this.layoutScaleFactorAutomatic = 1.0f;
        this.file = file;
        this.activeArtboard = artboard;
        List listSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
        listSynchronizedList.getClass();
        this.animationList = listSynchronizedList;
        List listSynchronizedList2 = DesugarCollections.synchronizedList(new ArrayList());
        listSynchronizedList2.getClass();
        this.stateMachineList = listSynchronizedList2;
        Set setSynchronizedSet = DesugarCollections.synchronizedSet(new HashSet());
        setSynchronizedSet.getClass();
        this.playingAnimationSet = setSynchronizedSet;
        Set setSynchronizedSet2 = DesugarCollections.synchronizedSet(new HashSet());
        setSynchronizedSet2.getClass();
        this.playingStateMachineSet = setSynchronizedSet2;
        this.startStopLock = new ReentrantLock();
        this.targetBounds = new RectF();
        Set setSynchronizedSet3 = DesugarCollections.synchronizedSet(new HashSet());
        setSynchronizedSet3.getClass();
        this._listeners = setSynchronizedSet3;
        Set setSynchronizedSet4 = DesugarCollections.synchronizedSet(new HashSet());
        setSynchronizedSet4.getClass();
        this._eventListeners = setSynchronizedSet4;
    }

    static final String _init_$lambda$0() {
        return "Initializing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_activeArtboard_$lambda$0$0(RiveFileController riveFileController) {
        Artboard artboard = riveFileController.activeArtboard;
        Objects.toString(artboard);
        return "Artboard set; releasing old artboard (if it exists): ".concat(String.valueOf(artboard));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_activeArtboard_$lambda$0$1(RiveFileController riveFileController) {
        Artboard artboard = riveFileController.activeArtboard;
        Objects.toString(artboard);
        return "Artboard set; acquiring new artboard (if it exists): ".concat(String.valueOf(artboard));
    }

    static final String _set_file_$lambda$0() {
        return "Assigning the same file; ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_file_$lambda$1$0$0(File file) {
        Objects.toString(file);
        return "File set; releasing old file: ".concat(String.valueOf(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_file_$lambda$1$1(File file) {
        Objects.toString(file);
        return "File set; acquiring new file (if it exists): ".concat(String.valueOf(file));
    }

    private final List animations(Collection collection) {
        List animations = getAnimations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : animations) {
            if (collection.contains(((LinearAnimationInstance) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    static final String autoplay$lambda$0() {
        return "autoplay() with autoplay enabled. Playing all state machines and animations.";
    }

    static final String autoplay$lambda$1() {
        return "autoplay() with autoplay disabled. Advancing the artboard by 0.";
    }

    public static /* synthetic */ void fireState$default(RiveFileController riveFileController, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        riveFileController.fireState(str, str2, str3);
    }

    private final List getOrCreateStateMachines(String str) throws StateMachineException {
        Artboard artboard;
        List listStateMachines = stateMachines(str);
        if (!listStateMachines.isEmpty() || (artboard = this.activeArtboard) == null) {
            return listStateMachines;
        }
        StateMachineInstance stateMachineInstanceStateMachine = artboard.stateMachine(str);
        this.stateMachineList.add(stateMachineInstanceStateMachine);
        return atqq.H(stateMachineInstanceStateMachine);
    }

    private final void notifyAdvance(float f) {
        Iterator it = atqq.ap(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyAdvance(f);
        }
    }

    private final void notifyEvent(RiveEvent riveEvent) {
        Iterator it = atqq.ap(getEventListeners()).iterator();
        while (it.hasNext()) {
            ((RiveEventListener) it.next()).notifyEvent(riveEvent);
        }
    }

    private final void notifyLoop(PlayableInstance playableInstance) {
        Iterator it = atqq.ap(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyLoop(playableInstance);
        }
    }

    private final void notifyPause(PlayableInstance playableInstance) {
        Iterator it = atqq.ap(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyPause(playableInstance);
        }
    }

    private final void notifyPlay(PlayableInstance playableInstance) {
        Iterator it = atqq.ap(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyPlay(playableInstance);
        }
    }

    private final void notifyStateChanged(StateMachineInstance stateMachineInstance, LayerState layerState) {
        Iterator it = atqq.ap(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyStateChanged(stateMachineInstance.getName(), layerState.toString());
        }
    }

    private final void notifyStop(PlayableInstance playableInstance) {
        Iterator it = atqq.ap(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyStop(playableInstance);
        }
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, String str, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            loop = Loop.AUTO;
        }
        if ((i & 4) != 0) {
            direction = Direction.AUTO;
        }
        riveFileController.play(str, loop, direction, z & ((i & 8) == 0), z2 | (!((i & 16) == 0)));
    }

    public static /* synthetic */ void play$third_party_java_android_libs_rive_rive_android$default(RiveFileController riveFileController, StateMachineInstance stateMachineInstance, boolean z, int i, Object obj) {
        riveFileController.play$third_party_java_android_libs_rive_rive_android(stateMachineInstance, (!((i & 2) == 0)) | z);
    }

    private final void playAnimation(String str, Loop loop, Direction direction, boolean z, boolean z2) {
        Artboard artboard;
        if (z) {
            Iterator it = getOrCreateStateMachines(str).iterator();
            while (it.hasNext()) {
                play$third_party_java_android_libs_rive_rive_android((StateMachineInstance) it.next(), z2);
            }
            return;
        }
        List listAnimations = animations(str);
        Iterator it2 = listAnimations.iterator();
        while (it2.hasNext()) {
            play$third_party_java_android_libs_rive_rive_android((LinearAnimationInstance) it2.next(), loop, direction);
        }
        if (!listAnimations.isEmpty() || (artboard = this.activeArtboard) == null) {
            return;
        }
        play$third_party_java_android_libs_rive_rive_android(artboard.animation(str), loop, direction);
    }

    static /* synthetic */ void playAnimation$default(RiveFileController riveFileController, String str, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            loop = Loop.AUTO;
        }
        if ((i & 4) != 0) {
            direction = Direction.AUTO;
        }
        riveFileController.playAnimation(str, loop, direction, z & ((i & 8) == 0), z2 | (!((i & 16) == 0)));
    }

    private final void processAllInputs() {
        ChangedInput changedInput;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (!this.changedInputs.isEmpty() && (changedInput = (ChangedInput) this.changedInputs.poll()) != null) {
            if (changedInput.getNestedArtboardPath() == null) {
                for (StateMachineInstance stateMachineInstance : getOrCreateStateMachines(changedInput.getStateMachineName())) {
                    linkedHashSet.add(stateMachineInstance);
                    SMIInput sMIInputInput = stateMachineInstance.input(changedInput.getName());
                    int iSwitchDispatch = RiveFileController$$ExternalSyntheticTypeSwitchClass22.switchDispatch(sMIInputInput, 0);
                    if (iSwitchDispatch == 0) {
                        ((SMITrigger) sMIInputInput).fire$third_party_java_android_libs_rive_rive_android();
                    } else if (iSwitchDispatch == 1) {
                        Object value = changedInput.getValue();
                        value.getClass();
                        ((SMIBoolean) sMIInputInput).setValue$third_party_java_android_libs_rive_rive_android(((Boolean) value).booleanValue());
                    } else if (iSwitchDispatch == 2) {
                        Object value2 = changedInput.getValue();
                        value2.getClass();
                        ((SMINumber) sMIInputInput).setValue$third_party_java_android_libs_rive_rive_android(((Float) value2).floatValue());
                    }
                }
            } else {
                Artboard artboard = this.activeArtboard;
                SMIInput sMIInputInput2 = artboard != null ? artboard.input(changedInput.getName(), changedInput.getNestedArtboardPath()) : null;
                int iSwitchDispatch2 = RiveFileController$$ExternalSyntheticTypeSwitchClass22.switchDispatch(sMIInputInput2, 0);
                if (iSwitchDispatch2 == 0) {
                    ((SMITrigger) sMIInputInput2).fire$third_party_java_android_libs_rive_rive_android();
                } else if (iSwitchDispatch2 == 1) {
                    Object value3 = changedInput.getValue();
                    value3.getClass();
                    ((SMIBoolean) sMIInputInput2).setValue$third_party_java_android_libs_rive_rive_android(((Boolean) value3).booleanValue());
                } else if (iSwitchDispatch2 == 2) {
                    Object value4 = changedInput.getValue();
                    value4.getClass();
                    ((SMINumber) sMIInputInput2).setValue$third_party_java_android_libs_rive_rive_android(((Float) value4).floatValue());
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            play$third_party_java_android_libs_rive_rive_android((StateMachineInstance) it.next(), false);
        }
    }

    private final void queueInput(String str, String str2, Object obj, String str3) {
        queueInputs$third_party_java_android_libs_rive_rive_android(new ChangedInput(str, str2, obj, str3));
    }

    static /* synthetic */ void queueInput$default(RiveFileController riveFileController, String str, String str2, Object obj, String str3, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        riveFileController.queueInput(str, str2, obj, str3);
    }

    static final String release$lambda$0(int i) {
        StringBuilder sb = new StringBuilder("Releasing. Old: ");
        sb.append(i);
        sb.append("; New: ");
        sb.append(i - 1);
        return sb.toString();
    }

    static final String release$lambda$1() {
        return "Final count is 0. Setting file to null.";
    }

    static final String reset$lambda$0() {
        return "Resetting.";
    }

    public static /* synthetic */ void selectArtboard$default(RiveFileController riveFileController, String str, int i, Object obj) throws ArtboardException {
        if (1 == (i & 1)) {
            str = null;
        }
        riveFileController.selectArtboard(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String selectArtboard$lambda$0$0(String str) {
        return "Selecting artboard: ".concat(String.valueOf(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String selectArtboard$lambda$0$1() {
        return "Selecting null artboard - choosing first.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String selectArtboard$lambda$1$0() {
        return "selectArtboard: cannot select an Artboard without a valid File.";
    }

    private final void setArtboard(Artboard artboard) {
        if (awrc.c(artboard, this.activeArtboard)) {
            return;
        }
        stopAnimations();
        setActiveArtboard(artboard);
        autoplay();
    }

    public static /* synthetic */ void setBooleanState$default(RiveFileController riveFileController, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        riveFileController.setBooleanState(str, str2, z, str3);
    }

    public static /* synthetic */ void setNumberState$default(RiveFileController riveFileController, String str, String str2, float f, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        riveFileController.setNumberState(str, str2, f, str3);
    }

    public static /* synthetic */ void setRiveFile$default(RiveFileController riveFileController, File file, String str, int i, Object obj) throws ArtboardException {
        if ((i & 2) != 0) {
            str = null;
        }
        riveFileController.setRiveFile(file, str);
    }

    static final String setupScene$lambda$0() {
        return "setupScene";
    }

    static final String setupScene$lambda$1() {
        return "Cannot setupScene without a file.";
    }

    static final String setupScene$lambda$2() {
        return "Auto-binding to the artboard and all state machines.";
    }

    static final String setupScene$lambda$3(Artboard artboard, ViewModelException viewModelException) {
        return "Could not auto-bind artboard " + artboard.getName() + ": " + viewModelException.getMessage();
    }

    static final String setupScene$lambda$6(String str) {
        return "Autoplay enabled. Playing animation: " + str + '.';
    }

    static final String setupScene$lambda$7(String str) {
        return "Autoplay enabled. Playing state machine: " + str + '.';
    }

    static final String setupScene$lambda$8() {
        return "Autoplay enabled. Playing all state machines and animations.";
    }

    static final String setupScene$lambda$9() {
        return "Autoplay disabled. Advancing the artboard by 0.";
    }

    private final List stateMachines(Collection collection) {
        List stateMachines = getStateMachines();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stateMachines) {
            if (collection.contains(((StateMachineInstance) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void stop(LinearAnimationInstance linearAnimationInstance) {
        this.playingAnimationSet.remove(linearAnimationInstance);
        if (this.animationList.remove(linearAnimationInstance)) {
            notifyStop(linearAnimationInstance);
        }
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public /* synthetic */ int acquire() {
        return getRefs().incrementAndGet();
    }

    public final void addEventListener(RiveEventListener riveEventListener) {
        riveEventListener.getClass();
        synchronized (this.startStopLock) {
            this._eventListeners.add(riveEventListener);
        }
    }

    public final void advance(float f) {
        Artboard artboard;
        File file = this.file;
        if (file != null) {
            synchronized (file.getFileLock$third_party_java_android_libs_rive_rive_android()) {
                if (this.file == file && (artboard = this.activeArtboard) != null) {
                    processAllInputs();
                    boolean zIsEmpty = false;
                    for (LinearAnimationInstance linearAnimationInstance : getAnimations()) {
                        if (getPlayingAnimations().contains(linearAnimationInstance)) {
                            AdvanceResult advanceResultAdvanceAndGetResult = linearAnimationInstance.advanceAndGetResult(f);
                            linearAnimationInstance.apply();
                            AdvanceResult advanceResult = AdvanceResult.ADVANCED;
                            PointerEvents pointerEvents = PointerEvents.POINTER_DOWN;
                            int iOrdinal = advanceResultAdvanceAndGetResult.ordinal();
                            if (iOrdinal == 0) {
                                zIsEmpty = getPlayingStateMachines().isEmpty();
                            } else if (iOrdinal == 1) {
                                stop(linearAnimationInstance);
                            } else if (iOrdinal == 2 || iOrdinal == 3) {
                                notifyLoop(linearAnimationInstance);
                            } else if (iOrdinal != 4) {
                                throw new awmj();
                            }
                        }
                    }
                    if (zIsEmpty) {
                        artboard.advance(f);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (StateMachineInstance stateMachineInstance : getStateMachines()) {
                        if (getPlayingStateMachines().contains(stateMachineInstance) && !resolveStateMachineAdvance$third_party_java_android_libs_rive_rive_android(stateMachineInstance, f)) {
                            arrayList.add(stateMachineInstance);
                        }
                    }
                    if (f > 0.0d) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            pause((StateMachineInstance) it.next());
                        }
                    }
                    HashSet playingStateMachines = getPlayingStateMachines();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = playingStateMachines.iterator();
                    while (it2.hasNext()) {
                        ViewModelInstance viewModelInstance = ((StateMachineInstance) it2.next()).getViewModelInstance();
                        if (viewModelInstance != null) {
                            arrayList2.add(viewModelInstance);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((ViewModelInstance) it3.next()).pollChanges$third_party_java_android_libs_rive_rive_android();
                    }
                    notifyAdvance(f);
                }
            }
        }
    }

    public final void autoplay() {
        if (this.autoplay) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController.autoplay$lambda$0();
                }
            });
            play$default(this, null, null, true, 3, null);
            return;
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveFileController.autoplay$lambda$1();
            }
        });
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.advance(0.0f);
        }
        synchronized (this.startStopLock) {
            Function0 function0 = this.onStart;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void fireState(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        queueInput$default(this, str, str2, null, str3, 4, null);
    }

    public final void fireStateAtPath(String str, String str2) {
        str.getClass();
        str2.getClass();
        queueInput$default(this, "", str, null, str2, 4, null);
    }

    public final Artboard getActiveArtboard() {
        return this.activeArtboard;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final List getAnimations() {
        List listAp;
        synchronized (this.animationList) {
            listAp = atqq.ap(this.animationList);
        }
        return listAp;
    }

    public final RectF getArtboardBounds() {
        RectF bounds;
        Artboard artboard = this.activeArtboard;
        return (artboard == null || (bounds = artboard.getBounds()) == null) ? new RectF() : bounds;
    }

    public final boolean getAutoplay() {
        return this.autoplay;
    }

    public final ConcurrentLinkedQueue getChangedInputs$third_party_java_android_libs_rive_rive_android() {
        return this.changedInputs;
    }

    public final HashSet getEventListeners() {
        HashSet hashSetAg;
        synchronized (this._eventListeners) {
            hashSetAg = atqq.ag(this._eventListeners);
        }
        return hashSetAg;
    }

    public final File getFile() {
        return this.file;
    }

    public final Fit getFit() {
        return this.fit;
    }

    public final Float getLayoutScaleFactor() {
        return this.layoutScaleFactor;
    }

    public final float getLayoutScaleFactorActive$third_party_java_android_libs_rive_rive_android() {
        Float f = this.layoutScaleFactor;
        return f != null ? f.floatValue() : this.layoutScaleFactorAutomatic;
    }

    public final float getLayoutScaleFactorAutomatic() {
        return this.layoutScaleFactorAutomatic;
    }

    public final HashSet getListeners() {
        HashSet hashSetAg;
        synchronized (this._listeners) {
            hashSetAg = atqq.ag(this._listeners);
        }
        return hashSetAg;
    }

    public final Loop getLoop() {
        return this.loop;
    }

    public final Function0 getOnStart() {
        return this.onStart;
    }

    public final Set getPausedAnimations() {
        return atqq.au(getAnimations(), getPlayingAnimations());
    }

    public final Set getPausedStateMachines() {
        return atqq.au(getStateMachines(), getPlayingStateMachines());
    }

    public final HashSet getPlayingAnimations() {
        HashSet hashSetAg;
        synchronized (this.playingAnimationSet) {
            hashSetAg = atqq.ag(this.playingAnimationSet);
        }
        return hashSetAg;
    }

    public final HashSet getPlayingStateMachines() {
        HashSet hashSetAg;
        synchronized (this.playingStateMachineSet) {
            hashSetAg = atqq.ag(this.playingStateMachineSet);
        }
        return hashSetAg;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public /* synthetic */ int getRefCount() {
        return getRefs().get();
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public AtomicInteger getRefs() {
        return this.refs;
    }

    public final AtomicBoolean getRequireArtboardResize$third_party_java_android_libs_rive_rive_android() {
        return this.requireArtboardResize;
    }

    public final ReentrantLock getStartStopLock$third_party_java_android_libs_rive_rive_android() {
        return this.startStopLock;
    }

    public final List getStateMachines() {
        List listAp;
        synchronized (this.stateMachineList) {
            listAp = atqq.ap(this.stateMachineList);
        }
        return listAp;
    }

    public final RectF getTargetBounds() {
        return this.targetBounds;
    }

    public final String getTextRunValue(String str, String str2) {
        str.getClass();
        str2.getClass();
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            return artboard.getTextRunValue(str, str2);
        }
        return null;
    }

    public final Float getVolume() {
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            return Float.valueOf(artboard.getVolume());
        }
        return null;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isAdvancing() {
        return (this.playingAnimationSet.isEmpty() && this.playingStateMachineSet.isEmpty() && this.changedInputs.isEmpty()) ? false : true;
    }

    public final void pause(String str, boolean z) {
        str.getClass();
        if (z) {
            Iterator it = stateMachines(str).iterator();
            while (it.hasNext()) {
                pause((StateMachineInstance) it.next());
            }
        } else {
            Iterator it2 = animations(str).iterator();
            while (it2.hasNext()) {
                pause((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void play(Loop loop, Direction direction, boolean z) {
        RiveFileController riveFileController;
        Loop loop2;
        Direction direction2;
        loop.getClass();
        direction.getClass();
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            if (!getPausedAnimations().isEmpty() || !getPausedStateMachines().isEmpty()) {
                Iterator it = getAnimations().iterator();
                while (it.hasNext()) {
                    play$third_party_java_android_libs_rive_rive_android((LinearAnimationInstance) it.next(), loop, direction);
                }
                Iterator it2 = getStateMachines().iterator();
                while (it2.hasNext()) {
                    play$third_party_java_android_libs_rive_rive_android((StateMachineInstance) it2.next(), z);
                }
                return;
            }
            List animationNames = artboard.getAnimationNames();
            if (animationNames.isEmpty()) {
                riveFileController = this;
                loop2 = loop;
                direction2 = direction;
            } else {
                String str = (String) atqq.X(animationNames);
                riveFileController = this;
                loop2 = loop;
                direction2 = direction;
                playAnimation$default(riveFileController, str, loop2, direction2, false, false, 24, null);
            }
            List stateMachineNames = artboard.getStateMachineNames();
            if (stateMachineNames.isEmpty()) {
                return;
            }
            riveFileController.playAnimation((String) atqq.X(stateMachineNames), loop2, direction2, true, z);
        }
    }

    public final void play$third_party_java_android_libs_rive_rive_android(LinearAnimationInstance linearAnimationInstance, Loop loop, Direction direction) {
        linearAnimationInstance.getClass();
        loop.getClass();
        direction.getClass();
        Loop loop2 = Loop.AUTO;
        if (loop == loop2) {
            loop = this.loop;
        }
        if (loop != loop2) {
            linearAnimationInstance.setLoop(loop);
        }
        if (!this.animationList.contains(linearAnimationInstance)) {
            if (direction == Direction.BACKWARDS) {
                linearAnimationInstance.time(linearAnimationInstance.getEndTime());
            }
            this.animationList.add(linearAnimationInstance);
        }
        if (direction != Direction.AUTO) {
            linearAnimationInstance.setDirection(direction);
        }
        synchronized (this.startStopLock) {
            this.playingAnimationSet.add(linearAnimationInstance);
            Function0 function0 = this.onStart;
            if (function0 != null) {
                function0.invoke();
            }
        }
        notifyPlay(linearAnimationInstance);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x009d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pointerEvent(app.rive.runtime.kotlin.renderers.PointerEvents r10, int r11, float r12, float r13) {
        /*
            r9 = this;
            r10.getClass()
            app.rive.runtime.kotlin.core.File r0 = r9.file
            if (r0 == 0) goto L9c
            java.util.concurrent.locks.ReentrantLock r1 = r0.getFileLock$third_party_java_android_libs_rive_rive_android()
            monitor-enter(r1)
            app.rive.runtime.kotlin.core.File r2 = r9.file     // Catch: java.lang.Throwable -> L9d
            if (r2 != r0) goto L9b
            app.rive.runtime.kotlin.core.Helpers r2 = app.rive.runtime.kotlin.core.Helpers.INSTANCE     // Catch: java.lang.Throwable -> L98
            android.graphics.RectF r3 = r9.targetBounds     // Catch: java.lang.Throwable -> L98
            android.graphics.PointF r4 = new android.graphics.PointF     // Catch: java.lang.Throwable -> L98
            r4.<init>(r12, r13)     // Catch: java.lang.Throwable -> L98
            app.rive.runtime.kotlin.core.Fit r5 = r9.fit     // Catch: java.lang.Throwable -> L98
            app.rive.runtime.kotlin.core.Alignment r6 = r9.alignment     // Catch: java.lang.Throwable -> L98
            app.rive.runtime.kotlin.core.Artboard r12 = r9.activeArtboard     // Catch: java.lang.Throwable -> L98
            if (r12 == 0) goto L27
            android.graphics.RectF r12 = r12.getBounds()     // Catch: java.lang.Throwable -> L98
            if (r12 != 0) goto L2c
        L27:
            android.graphics.RectF r12 = new android.graphics.RectF     // Catch: java.lang.Throwable -> L98
            r12.<init>()     // Catch: java.lang.Throwable -> L98
        L2c:
            r7 = r12
            float r8 = r9.getLayoutScaleFactorActive$third_party_java_android_libs_rive_rive_android()     // Catch: java.lang.Throwable -> L98
            android.graphics.PointF r12 = r2.convertToArtboardSpace(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L98
            java.util.List r13 = r9.getStateMachines()     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L98
        L3d:
            boolean r0 = r13.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r13.next()     // Catch: java.lang.Throwable -> L98
            app.rive.runtime.kotlin.core.StateMachineInstance r0 = (app.rive.runtime.kotlin.core.StateMachineInstance) r0     // Catch: java.lang.Throwable -> L98
            app.rive.runtime.kotlin.core.AdvanceResult r2 = app.rive.runtime.kotlin.core.AdvanceResult.ADVANCED     // Catch: java.lang.Throwable -> L98
            app.rive.runtime.kotlin.renderers.PointerEvents r2 = app.rive.runtime.kotlin.renderers.PointerEvents.POINTER_DOWN     // Catch: java.lang.Throwable -> L98
            int r2 = r10.ordinal()     // Catch: java.lang.Throwable -> L98
            r3 = 0
            if (r2 == 0) goto L7d
            r4 = 1
            if (r2 == r4) goto L74
            r4 = 2
            if (r2 == r4) goto L6b
            r4 = 3
            if (r2 != r4) goto L65
            float r2 = r12.x     // Catch: java.lang.Throwable -> L98
            float r4 = r12.y     // Catch: java.lang.Throwable -> L98
            r0.pointerExit(r11, r2, r4)     // Catch: java.lang.Throwable -> L98
            goto L72
        L65:
            awmj r9 = new awmj     // Catch: java.lang.Throwable -> L98
            r9.<init>()     // Catch: java.lang.Throwable -> L98
            throw r9     // Catch: java.lang.Throwable -> L98
        L6b:
            float r2 = r12.x     // Catch: java.lang.Throwable -> L98
            float r4 = r12.y     // Catch: java.lang.Throwable -> L98
            r0.pointerMove(r11, r2, r4)     // Catch: java.lang.Throwable -> L98
        L72:
            r2 = r3
            goto L85
        L74:
            float r2 = r12.x     // Catch: java.lang.Throwable -> L98
            float r4 = r12.y     // Catch: java.lang.Throwable -> L98
            boolean r2 = r0.pointerUp(r11, r2, r4)     // Catch: java.lang.Throwable -> L98
            goto L85
        L7d:
            float r2 = r12.x     // Catch: java.lang.Throwable -> L98
            float r4 = r12.y     // Catch: java.lang.Throwable -> L98
            boolean r2 = r0.pointerDown(r11, r2, r4)     // Catch: java.lang.Throwable -> L98
        L85:
            r9.play$third_party_java_android_libs_rive_rive_android(r0, r3)     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L3d
            r2 = 0
            r9.resolveStateMachineAdvance$third_party_java_android_libs_rive_rive_android(r0, r2)     // Catch: java.lang.Throwable -> L98
            app.rive.runtime.kotlin.core.ViewModelInstance r0 = r0.getViewModelInstance()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L3d
            r0.pollChanges$third_party_java_android_libs_rive_rive_android()     // Catch: java.lang.Throwable -> L98
            goto L3d
        L98:
            r0 = move-exception
            r9 = r0
            throw r9     // Catch: java.lang.Throwable -> L9d
        L9b:
            monitor-exit(r1)
        L9c:
            return
        L9d:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.rive.runtime.kotlin.controllers.RiveFileController.pointerEvent(app.rive.runtime.kotlin.renderers.PointerEvents, int, float, float):void");
    }

    public final void queueInputs$third_party_java_android_libs_rive_rive_android(ChangedInput... changedInputArr) {
        changedInputArr.getClass();
        synchronized (this.startStopLock) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.changedInputs;
            concurrentLinkedQueue.getClass();
            concurrentLinkedQueue.addAll(atqq.aL(changedInputArr));
            Function0 function0 = this.onStart;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void registerListener(Listener listener) {
        listener.getClass();
        synchronized (this.startStopLock) {
            this._listeners.add(listener);
        }
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int release() {
        final int i = getRefs().get();
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveFileController.release$lambda$0(i);
            }
        });
        int iDecrementAndGet = getRefs().decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iDecrementAndGet == 0) {
            if (this.isActive) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController.release$lambda$1();
                }
            });
            setFile(null);
        }
        return iDecrementAndGet;
    }

    public final void removeEventListener(RiveEventListener riveEventListener) {
        riveEventListener.getClass();
        synchronized (this.startStopLock) {
            this._eventListeners.remove(riveEventListener);
        }
    }

    public final void reset$third_party_java_android_libs_rive_rive_android() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveFileController.reset$lambda$0();
            }
        });
        this.playingAnimationSet.clear();
        this.animationList.clear();
        this.playingStateMachineSet.clear();
        this.stateMachineList.clear();
        this.changedInputs.clear();
        setActiveArtboard(null);
    }

    public final boolean resolveStateMachineAdvance$third_party_java_android_libs_rive_rive_android(StateMachineInstance stateMachineInstance, float f) {
        stateMachineInstance.getClass();
        File file = this.file;
        boolean zAdvance = false;
        if (file != null) {
            synchronized (file.getFileLock$third_party_java_android_libs_rive_rive_android()) {
                if (this.file == file) {
                    if (!getEventListeners().isEmpty()) {
                        Iterator it = stateMachineInstance.getEventsReported().iterator();
                        while (it.hasNext()) {
                            notifyEvent((RiveEvent) it.next());
                        }
                    }
                    zAdvance = stateMachineInstance.advance(f);
                    if (!getListeners().isEmpty()) {
                        Iterator it2 = stateMachineInstance.getStatesChanged().iterator();
                        while (it2.hasNext()) {
                            notifyStateChanged(stateMachineInstance, (LayerState) it2.next());
                        }
                    }
                }
            }
        }
        return zAdvance;
    }

    public final void restoreControllerState(ControllerState controllerState) {
        Object fileLock$third_party_java_android_libs_rive_rive_android;
        controllerState.getClass();
        File file = this.file;
        if (file == null || (fileLock$third_party_java_android_libs_rive_rive_android = file.getFileLock$third_party_java_android_libs_rive_rive_android()) == null) {
            fileLock$third_party_java_android_libs_rive_rive_android = this;
        }
        synchronized (fileLock$third_party_java_android_libs_rive_rive_android) {
            reset$third_party_java_android_libs_rive_rive_android();
            setFile(controllerState.getFile());
            setActiveArtboard(controllerState.getActiveArtboard());
            Iterator it = controllerState.getAnimations().iterator();
            while (it.hasNext()) {
                this.animationList.add((LinearAnimationInstance) it.next());
            }
            Iterator it2 = controllerState.getStateMachines().iterator();
            while (it2.hasNext()) {
                this.stateMachineList.add((StateMachineInstance) it2.next());
            }
            for (LinearAnimationInstance linearAnimationInstance : controllerState.getPlayingAnimations()) {
                play$third_party_java_android_libs_rive_rive_android(linearAnimationInstance, linearAnimationInstance.getLoop(), linearAnimationInstance.getDirection());
            }
            Iterator it3 = controllerState.getPlayingStateMachines().iterator();
            while (it3.hasNext()) {
                play$third_party_java_android_libs_rive_rive_android$default(this, (StateMachineInstance) it3.next(), false, 2, null);
            }
            this.isActive = controllerState.isActive();
            controllerState.dispose();
        }
    }

    public final ControllerState saveControllerState() {
        Artboard artboard;
        File file = this.file;
        ControllerState controllerState = null;
        if (file != null && (artboard = this.activeArtboard) != null) {
            synchronized (file.getFileLock$third_party_java_android_libs_rive_rive_android()) {
                if (file.getHasCppObject()) {
                    file.acquire();
                    artboard.acquire();
                    controllerState = new ControllerState(file, artboard, atqq.ap(this.animationList), atqq.ag(getPlayingAnimations()), atqq.ap(this.stateMachineList), atqq.ag(getPlayingStateMachines()), this.isActive);
                }
            }
        }
        return controllerState;
    }

    public final void selectArtboard(final String str) throws ArtboardException {
        Artboard firstArtboard;
        File file = this.file;
        if (file == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController.selectArtboard$lambda$1$0();
                }
            });
            return;
        }
        if (str != null) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController.selectArtboard$lambda$0$0(str);
                }
            });
            firstArtboard = file.artboard(str);
        } else {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController.selectArtboard$lambda$0$1();
                }
            });
            firstArtboard = file.getFirstArtboard();
        }
        setArtboard(firstArtboard);
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void setActiveArtboard(Artboard artboard) {
        Object fileLock$third_party_java_android_libs_rive_rive_android;
        if (awrc.c(artboard, this.activeArtboard)) {
            return;
        }
        File file = this.file;
        if (file == null || (fileLock$third_party_java_android_libs_rive_rive_android = file.getFileLock$third_party_java_android_libs_rive_rive_android()) == null) {
            fileLock$third_party_java_android_libs_rive_rive_android = this;
        }
        synchronized (fileLock$third_party_java_android_libs_rive_rive_android) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController._set_activeArtboard_$lambda$0$0(this.f$0);
                }
            });
            Artboard artboard2 = this.activeArtboard;
            if (artboard2 != null) {
                artboard2.release();
            }
            this.activeArtboard = artboard;
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController._set_activeArtboard_$lambda$0$1(this.f$0);
                }
            });
            Artboard artboard3 = this.activeArtboard;
            if (artboard3 != null) {
                artboard3.acquire();
            }
            Float f = this.userSetVolume;
            if (f != null) {
                float fFloatValue = f.floatValue();
                Artboard artboard4 = this.activeArtboard;
                if (artboard4 != null) {
                    artboard4.setVolume$third_party_java_android_libs_rive_rive_android(fFloatValue);
                }
            }
            if (artboard != null) {
                this.requireArtboardResize.set(true);
            }
        }
    }

    public final void setAlignment(Alignment alignment) {
        alignment.getClass();
        this.alignment = alignment;
        synchronized (this.startStopLock) {
            Function0 function0 = this.onStart;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void setAutoplay(boolean z) {
        this.autoplay = z;
    }

    public final void setBooleanState(String str, String str2, boolean z, String str3) {
        str.getClass();
        str2.getClass();
        queueInput(str, str2, Boolean.valueOf(z), str3);
    }

    public final void setBooleanStateAtPath(String str, boolean z, String str2) {
        str.getClass();
        str2.getClass();
        queueInput("", str, Boolean.valueOf(z), str2);
    }

    public final void setFile(final File file) {
        Object fileLock$third_party_java_android_libs_rive_rive_android;
        if (awrc.c(file, this.file)) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController._set_file_$lambda$0();
                }
            });
            return;
        }
        File file2 = this.file;
        if (file2 == null || (fileLock$third_party_java_android_libs_rive_rive_android = file2.getFileLock$third_party_java_android_libs_rive_rive_android()) == null) {
            fileLock$third_party_java_android_libs_rive_rive_android = this;
        }
        synchronized (fileLock$third_party_java_android_libs_rive_rive_android) {
            final File file3 = this.file;
            if (file3 != null) {
                RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RiveFileController._set_file_$lambda$1$0$0(file3);
                    }
                });
                reset$third_party_java_android_libs_rive_rive_android();
                file3.release();
            }
            this.file = file;
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController._set_file_$lambda$1$1(file);
                }
            });
            File file4 = this.file;
            if (file4 != null) {
                file4.acquire();
            }
        }
    }

    public final void setFit(Fit fit) {
        fit.getClass();
        this.fit = fit;
        this.requireArtboardResize.set(true);
        synchronized (this.startStopLock) {
            Function0 function0 = this.onStart;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void setLayoutScaleFactor(Float f) {
        this.layoutScaleFactor = f;
        this.requireArtboardResize.set(true);
        synchronized (this.startStopLock) {
            Function0 function0 = this.onStart;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void setLayoutScaleFactorAutomatic$third_party_java_android_libs_rive_rive_android(float f) {
        if (this.layoutScaleFactorAutomatic != f) {
            this.layoutScaleFactorAutomatic = f;
            this.requireArtboardResize.set(true);
            synchronized (this.startStopLock) {
                Function0 function0 = this.onStart;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public final void setLoop(Loop loop) {
        loop.getClass();
        this.loop = loop;
    }

    public final void setNumberState(String str, String str2, float f, String str3) {
        str.getClass();
        str2.getClass();
        queueInput(str, str2, Float.valueOf(f), str3);
    }

    public final void setNumberStateAtPath(String str, float f, String str2) {
        str.getClass();
        str2.getClass();
        queueInput("", str, Float.valueOf(f), str2);
    }

    public final void setOnStart(Function0 function0) {
        this.onStart = function0;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public void setRefs(AtomicInteger atomicInteger) {
        atomicInteger.getClass();
        this.refs = atomicInteger;
    }

    public final void setRequireArtboardResize$third_party_java_android_libs_rive_rive_android(AtomicBoolean atomicBoolean) {
        atomicBoolean.getClass();
        this.requireArtboardResize = atomicBoolean;
    }

    public final void setRiveFile(File file, String str) throws ArtboardException {
        file.getClass();
        if (awrc.c(file, this.file)) {
            return;
        }
        setFile(file);
        selectArtboard(str);
    }

    public final void setTargetBounds(RectF rectF) {
        rectF.getClass();
        this.targetBounds = rectF;
    }

    public final void setTextRunValue(String str, String str2, String str3) throws TextValueRunException {
        str.getClass();
        str2.getClass();
        str3.getClass();
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.setTextRunValue(str, str2, str3);
        }
        Iterator it = getStateMachines().iterator();
        while (it.hasNext()) {
            play$third_party_java_android_libs_rive_rive_android((StateMachineInstance) it.next(), false);
        }
    }

    public final void setVolume(float f) {
        this.userSetVolume = Float.valueOf(f);
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.setVolume$third_party_java_android_libs_rive_rive_android(f);
        }
    }

    public final void setupScene$third_party_java_android_libs_rive_rive_android(RiveAnimationView.RendererAttributes rendererAttributes) throws StateMachineException {
        ViewModelInstance viewModelInstanceCreateDefaultInstance;
        rendererAttributes.getClass();
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveFileController.setupScene$lambda$0();
            }
        });
        File file = this.file;
        if (file == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController.setupScene$lambda$1();
                }
            });
            return;
        }
        reset$third_party_java_android_libs_rive_rive_android();
        this.autoplay = rendererAttributes.getAutoplay();
        setAlignment(rendererAttributes.getAlignment());
        setFit(rendererAttributes.getFit());
        this.loop = rendererAttributes.getLoop();
        String artboardName = rendererAttributes.getArtboardName();
        setActiveArtboard(artboardName != null ? file.artboard(artboardName) : file.getFirstArtboard());
        if (rendererAttributes.getAutoBind() && this.activeArtboard != null) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController.setupScene$lambda$2();
                }
            });
            final Artboard artboard = this.activeArtboard;
            artboard.getClass();
            try {
                viewModelInstanceCreateDefaultInstance = file.defaultViewModelForArtboard(artboard).createDefaultInstance();
            } catch (ViewModelException e) {
                RiveLog.INSTANCE.getLogger().e(TAG, e, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RiveFileController.setupScene$lambda$3(artboard, e);
                    }
                });
                viewModelInstanceCreateDefaultInstance = null;
            }
            if (viewModelInstanceCreateDefaultInstance != null) {
                artboard.setViewModelInstance(viewModelInstanceCreateDefaultInstance);
                String stateMachineName = rendererAttributes.getStateMachineName();
                if (stateMachineName == null) {
                    stateMachineName = (String) atqq.Z(artboard.getStateMachineNames());
                }
                if (stateMachineName != null) {
                    getOrCreateStateMachines(stateMachineName);
                }
                Iterator it = getStateMachines().iterator();
                while (it.hasNext()) {
                    ((StateMachineInstance) it.next()).setViewModelInstance(viewModelInstanceCreateDefaultInstance);
                }
            }
        }
        if (!this.autoplay) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController.setupScene$lambda$9();
                }
            });
            Artboard artboard2 = this.activeArtboard;
            if (artboard2 != null) {
                artboard2.advance(0.0f);
            }
            synchronized (this.startStopLock) {
                Function0 function0 = this.onStart;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            return;
        }
        final String animationName = rendererAttributes.getAnimationName();
        final String stateMachineName2 = rendererAttributes.getStateMachineName();
        if (animationName != null) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController.setupScene$lambda$6(animationName);
                }
            });
            play$default(this, animationName, (Loop) null, (Direction) null, false, false, 30, (Object) null);
        } else if (stateMachineName2 != null) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController.setupScene$lambda$7(stateMachineName2);
                }
            });
            play$default(this, stateMachineName2, (Loop) null, (Direction) null, true, true, 6, (Object) null);
        } else {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.controllers.RiveFileController$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveFileController.setupScene$lambda$8();
                }
            });
            play$default(this, null, null, true, 3, null);
        }
    }

    public final void stopAnimations() {
        if (!this.animationList.isEmpty()) {
            Iterator it = getAnimations().iterator();
            while (it.hasNext()) {
                stop((LinearAnimationInstance) it.next());
            }
        }
        if (this.stateMachineList.isEmpty()) {
            return;
        }
        Iterator it2 = getStateMachines().iterator();
        while (it2.hasNext()) {
            stop((StateMachineInstance) it2.next());
        }
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void unregisterListener(Listener listener) {
        listener.getClass();
        synchronized (this.startStopLock) {
            this._listeners.remove(listener);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    private final void stop(StateMachineInstance stateMachineInstance) {
        this.playingStateMachineSet.remove(stateMachineInstance);
        if (this.stateMachineList.remove(stateMachineInstance)) {
            notifyStop(stateMachineInstance);
        }
    }

    public final String getTextRunValue(String str) {
        str.getClass();
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            return artboard.getTextRunValue(str);
        }
        return null;
    }

    public static /* synthetic */ void getAnimations$annotations() {
    }

    public static /* synthetic */ void getChangedInputs$third_party_java_android_libs_rive_rive_android$annotations() {
    }

    public static /* synthetic */ void getEventListeners$annotations() {
    }

    public static /* synthetic */ void getListeners$annotations() {
    }

    public static /* synthetic */ void getLoop$annotations() {
    }

    public static /* synthetic */ void getPausedAnimations$annotations() {
    }

    public static /* synthetic */ void getPlayingAnimations$annotations() {
    }

    public static /* synthetic */ void getPlayingStateMachines$annotations() {
    }

    public static /* synthetic */ void getStateMachines$annotations() {
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, Loop loop, Direction direction, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            loop = Loop.AUTO;
        }
        if ((i & 2) != 0) {
            direction = Direction.AUTO;
        }
        riveFileController.play(loop, direction, (!((i & 4) == 0)) | z);
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, List list, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            loop = Loop.AUTO;
        }
        if ((i & 4) != 0) {
            direction = Direction.AUTO;
        }
        riveFileController.play(list, loop, direction, z & ((i & 8) == 0), z2 | (!((i & 16) == 0)));
    }

    private final List animations(String str) {
        return animations(atqq.H(str));
    }

    private final List stateMachines(String str) {
        return stateMachines(atqq.H(str));
    }

    public final void setTextRunValue(String str, String str2) throws TextValueRunException {
        str.getClass();
        str2.getClass();
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.setTextRunValue(str, str2);
        }
        Iterator it = getStateMachines().iterator();
        while (it.hasNext()) {
            play$third_party_java_android_libs_rive_rive_android((StateMachineInstance) it.next(), false);
        }
    }

    /* JADX INFO: compiled from: PG */
    public interface Listener {
        void notifyAdvance(float f);

        void notifyLoop(PlayableInstance playableInstance);

        void notifyPause(PlayableInstance playableInstance);

        void notifyPlay(PlayableInstance playableInstance);

        void notifyStateChanged(String str, String str2);

        void notifyStop(PlayableInstance playableInstance);

        /* JADX INFO: renamed from: app.rive.runtime.kotlin.controllers.RiveFileController$Listener$-CC, reason: invalid class name */
        /* JADX INFO: compiled from: PG */
        public final /* synthetic */ class CC {
            public static void $default$notifyAdvance(Listener listener, float f) {
            }
        }
    }

    private final void pause(LinearAnimationInstance linearAnimationInstance) {
        if (this.playingAnimationSet.remove(linearAnimationInstance)) {
            notifyPause(linearAnimationInstance);
        }
    }

    private final void pause(StateMachineInstance stateMachineInstance) {
        if (this.playingStateMachineSet.remove(stateMachineInstance)) {
            notifyPause(stateMachineInstance);
        }
    }

    public final void pause() {
        Iterator it = getPlayingAnimations().iterator();
        while (it.hasNext()) {
            pause((LinearAnimationInstance) it.next());
        }
        Iterator it2 = getPlayingStateMachines().iterator();
        while (it2.hasNext()) {
            pause((StateMachineInstance) it2.next());
        }
    }

    public final void pause(List list, boolean z) {
        list.getClass();
        if (z) {
            Iterator it = stateMachines(list).iterator();
            while (it.hasNext()) {
                pause((StateMachineInstance) it.next());
            }
        } else {
            Iterator it2 = animations(list).iterator();
            while (it2.hasNext()) {
                pause((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void stopAnimations(String str, boolean z) {
        str.getClass();
        if (z) {
            Iterator it = stateMachines(str).iterator();
            while (it.hasNext()) {
                stop((StateMachineInstance) it.next());
            }
        } else {
            Iterator it2 = animations(str).iterator();
            while (it2.hasNext()) {
                stop((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void stopAnimations(List list, boolean z) {
        list.getClass();
        if (z) {
            Iterator it = stateMachines(list).iterator();
            while (it.hasNext()) {
                stop((StateMachineInstance) it.next());
            }
        } else {
            Iterator it2 = animations(list).iterator();
            while (it2.hasNext()) {
                stop((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void play$third_party_java_android_libs_rive_rive_android(StateMachineInstance stateMachineInstance, boolean z) {
        stateMachineInstance.getClass();
        if (!this.stateMachineList.contains(stateMachineInstance)) {
            this.stateMachineList.add(stateMachineInstance);
        }
        if (z) {
            resolveStateMachineAdvance$third_party_java_android_libs_rive_rive_android(stateMachineInstance, 0.0f);
        }
        synchronized (this.startStopLock) {
            this.playingStateMachineSet.add(stateMachineInstance);
            Function0 function0 = this.onStart;
            if (function0 != null) {
                function0.invoke();
            }
        }
        notifyPlay(stateMachineInstance);
    }

    public final void play(String str, Loop loop, Direction direction, boolean z, boolean z2) {
        str.getClass();
        loop.getClass();
        direction.getClass();
        playAnimation(str, loop, direction, z, z2);
    }

    public final void play(List list, Loop loop, Direction direction, boolean z, boolean z2) {
        list.getClass();
        loop.getClass();
        direction.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            playAnimation((String) it.next(), loop, direction, z, z2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveFileController(Loop loop, boolean z, File file, Artboard artboard, Function0 function0) {
        this(loop, z, file, artboard, function0, new ConcurrentLinkedQueue());
        loop.getClass();
    }

    public /* synthetic */ RiveFileController(Loop loop, boolean z, File file, Artboard artboard, Function0 function0, int i, awqx awqxVar) {
        this((i & 1) != 0 ? Loop.AUTO : loop, z | (!((i & 2) == 0)), (i & 4) != 0 ? null : file, (i & 8) != 0 ? null : artboard, (i & 16) != 0 ? null : function0);
    }

    public RiveFileController() {
        this(null, false, null, null, null, null, 63, null);
    }

    public /* synthetic */ RiveFileController(Loop loop, boolean z, File file, Artboard artboard, Function0 function0, ConcurrentLinkedQueue concurrentLinkedQueue, int i, awqx awqxVar) {
        this((i & 1) != 0 ? Loop.AUTO : loop, z | (!((i & 2) == 0)), (i & 4) != 0 ? null : file, (i & 8) != 0 ? null : artboard, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? new ConcurrentLinkedQueue() : concurrentLinkedQueue);
    }
}
