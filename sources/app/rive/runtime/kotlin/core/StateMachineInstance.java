package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveEventException;
import app.rive.runtime.kotlin.core.errors.StateMachineInputException;
import defpackage.atqq;
import defpackage.awns;
import defpackage.awrc;
import defpackage.awro;
import defpackage.awrz;
import defpackage.awsa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class StateMachineInstance extends NativeObject implements PlayableInstance {
    public static final int $stable = 8;
    private final ReentrantLock fileLock;
    private ViewModelInstance viewModelInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachineInstance(long j, ReentrantLock reentrantLock) {
        super(j);
        reentrantLock.getClass();
        this.fileLock = reentrantLock;
    }

    private final SMIInput convertInput(SMIInput sMIInput) throws StateMachineInputException {
        if (sMIInput.isBoolean()) {
            return new SMIBoolean(sMIInput.getCppPointer(), this.fileLock);
        }
        if (sMIInput.isTrigger()) {
            return new SMITrigger(sMIInput.getCppPointer(), this.fileLock);
        }
        if (sMIInput.isNumber()) {
            return new SMINumber(sMIInput.getCppPointer(), this.fileLock);
        }
        throw new StateMachineInputException("Unknown State Machine Input Instance for " + sMIInput.getName() + '.');
    }

    private final LayerState convertLayerState(LayerState layerState) throws StateMachineInputException {
        if (layerState.isAnimationState()) {
            return new AnimationState(layerState.getCppPointer());
        }
        if (layerState.isAnyState()) {
            return new AnyState(layerState.getCppPointer());
        }
        if (layerState.isEntryState()) {
            return new EntryState(layerState.getCppPointer());
        }
        if (layerState.isExitState()) {
            return new ExitState(layerState.getCppPointer());
        }
        if (layerState.isBlendState()) {
            return new BlendState(layerState.getCppPointer());
        }
        throw new StateMachineInputException("Unknown Layer State for " + layerState + '.');
    }

    private final native boolean cppAdvance(long j, float f);

    private final native int cppInputCount(long j);

    private final native int cppLayerCount(long j);

    private final native String cppName(long j);

    private final native boolean cppPointerDown(long j, int i, float f, float f2);

    private final native void cppPointerExit(long j, int i, float f, float f2);

    private final native void cppPointerMove(long j, int i, float f, float f2);

    private final native boolean cppPointerUp(long j, int i, float f, float f2);

    private final native RiveEventReport cppReportedEventAt(long j, int i);

    private final native int cppReportedEventCount(long j);

    private final native long cppSMIInputByIndex(long j, int i);

    private final native void cppSetViewModelInstance(long j, long j2);

    private final native long cppStateChangedByIndex(long j, int i);

    private final native int cppStateChangedCount(long j);

    private final int getReportedEventCount() {
        return cppReportedEventCount(getCppPointer());
    }

    private final int getStateChangedCount() {
        return cppStateChangedCount(getCppPointer());
    }

    public final boolean advance(float f) {
        boolean zCppAdvance;
        synchronized (this.fileLock) {
            zCppAdvance = cppAdvance(getCppPointer(), f);
        }
        return zCppAdvance;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j);

    public final RiveEvent eventAt(int i) {
        RiveEvent event;
        synchronized (this.fileLock) {
            RiveEventReport riveEventReportCppReportedEventAt = cppReportedEventAt(getCppPointer(), i);
            if (riveEventReportCppReportedEventAt.getUnsafeCppPointer() == 0) {
                throw new RiveEventException("No Rive Event found at index " + i + '.');
            }
            event = riveEventReportCppReportedEventAt.getEvent();
        }
        return event;
    }

    public final List getEventsReported() {
        ArrayList arrayList;
        synchronized (this.fileLock) {
            awsa awsaVarL = awro.l(0, getReportedEventCount());
            arrayList = new ArrayList(atqq.N(awsaVarL, 10));
            awns it = awsaVarL.iterator();
            while (((awrz) it).a) {
                arrayList.add(eventAt(it.a()));
            }
        }
        return arrayList;
    }

    public final int getInputCount() {
        int iCppInputCount;
        synchronized (this.fileLock) {
            iCppInputCount = cppInputCount(getCppPointer());
        }
        return iCppInputCount;
    }

    public final List getInputNames() {
        ArrayList arrayList;
        synchronized (this.fileLock) {
            awsa awsaVarL = awro.l(0, getInputCount());
            arrayList = new ArrayList(atqq.N(awsaVarL, 10));
            awns it = awsaVarL.iterator();
            while (((awrz) it).a) {
                arrayList.add(input(it.a()).getName());
            }
        }
        return arrayList;
    }

    public final List getInputs() {
        ArrayList arrayList;
        synchronized (this.fileLock) {
            awsa awsaVarL = awro.l(0, getInputCount());
            arrayList = new ArrayList(atqq.N(awsaVarL, 10));
            awns it = awsaVarL.iterator();
            while (((awrz) it).a) {
                arrayList.add(input(it.a()));
            }
        }
        return arrayList;
    }

    public final int getLayerCount() {
        return cppLayerCount(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.PlayableInstance
    public String getName() {
        return cppName(getCppPointer());
    }

    public final List getStatesChanged() {
        ArrayList arrayList;
        synchronized (this.fileLock) {
            awsa awsaVarL = awro.l(0, getStateChangedCount());
            arrayList = new ArrayList(atqq.N(awsaVarL, 10));
            awns it = awsaVarL.iterator();
            while (((awrz) it).a) {
                arrayList.add(stateChanged(it.a()));
            }
        }
        return arrayList;
    }

    public final ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    public final SMIInput input(String str) {
        SMIInput sMIInputInput;
        str.getClass();
        synchronized (this.fileLock) {
            int inputCount = getInputCount();
            for (int i = 0; i < inputCount; i++) {
                sMIInputInput = input(i);
                if (!awrc.c(sMIInputInput.getName(), str)) {
                }
            }
            throw new StateMachineInputException("No StateMachineInput found with name " + str + '.');
        }
        return sMIInputInput;
    }

    public final boolean pointerDown(int i, float f, float f2) {
        boolean zCppPointerDown;
        synchronized (this.fileLock) {
            zCppPointerDown = cppPointerDown(getCppPointer(), i, f, f2);
        }
        return zCppPointerDown;
    }

    public final void pointerExit(int i, float f, float f2) {
        synchronized (this.fileLock) {
            cppPointerExit(getCppPointer(), i, f, f2);
        }
    }

    public final void pointerMove(int i, float f, float f2) {
        synchronized (this.fileLock) {
            cppPointerMove(getCppPointer(), i, f, f2);
        }
    }

    public final boolean pointerUp(int i, float f, float f2) {
        boolean zCppPointerUp;
        synchronized (this.fileLock) {
            zCppPointerUp = cppPointerUp(getCppPointer(), i, f, f2);
        }
        return zCppPointerUp;
    }

    public final ViewModelInstance receiveViewModelInstance(ViewModelInstance.Transfer transfer) {
        transfer.getClass();
        ViewModelInstance viewModelInstanceEnd$third_party_java_android_libs_rive_rive_android = transfer.end$third_party_java_android_libs_rive_rive_android();
        getDependencies().add(viewModelInstanceEnd$third_party_java_android_libs_rive_rive_android);
        setViewModelInstance(viewModelInstanceEnd$third_party_java_android_libs_rive_rive_android);
        return viewModelInstanceEnd$third_party_java_android_libs_rive_rive_android;
    }

    public final void setViewModelInstance(ViewModelInstance viewModelInstance) {
        if (viewModelInstance != null) {
            viewModelInstance.updateFileLock$third_party_java_android_libs_rive_rive_android(this.fileLock);
        }
        synchronized (this.fileLock) {
            if (viewModelInstance != null) {
                cppSetViewModelInstance(getCppPointer(), viewModelInstance.getCppPointer());
            }
            this.viewModelInstance = viewModelInstance;
        }
    }

    public final LayerState stateChanged(int i) {
        LayerState layerStateConvertLayerState;
        synchronized (this.fileLock) {
            long jCppStateChangedByIndex = cppStateChangedByIndex(getCppPointer(), i);
            if (jCppStateChangedByIndex == 0) {
                throw new StateMachineInputException("No LayerState found at index " + i + '.');
            }
            layerStateConvertLayerState = convertLayerState(new LayerState(jCppStateChangedByIndex));
        }
        return layerStateConvertLayerState;
    }

    public static /* synthetic */ void getEventsReported$annotations() {
    }

    public static /* synthetic */ void getInputCount$annotations() {
    }

    public static /* synthetic */ void getInputNames$annotations() {
    }

    public static /* synthetic */ void getInputs$annotations() {
    }

    public final SMIInput input(int i) {
        SMIInput sMIInputConvertInput;
        synchronized (this.fileLock) {
            long jCppSMIInputByIndex = cppSMIInputByIndex(getCppPointer(), i);
            if (jCppSMIInputByIndex != 0) {
                sMIInputConvertInput = convertInput(new SMIInput(jCppSMIInputByIndex, this.fileLock));
            } else {
                throw new StateMachineInputException("No StateMachineInput found at index " + i + '.');
            }
        }
        return sMIInputConvertInput;
    }
}
