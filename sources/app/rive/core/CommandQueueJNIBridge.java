package app.rive.core;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class CommandQueueJNIBridge implements CommandQueueBridge {
    public static final int $stable = 0;

    @Override // app.rive.core.CommandQueueBridge
    public native void cppAdvanceStateMachine(long j, long j2, long j3, long j4);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppAppendToList(long j, long j2, String str, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppBind(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppCancelDraw(long j, long j2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppClearFocus(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppClearGlobalViewModelInstance(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppClearMainViewModelInstance(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppClearSemanticFocus(long j, long j2);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppConstructor(long j);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppCreateArtboardByName(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppCreateDefaultArtboard(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppCreateDefaultStateMachine(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppCreateDrawKey(long j);

    @Override // app.rive.core.CommandQueueBridge
    public native Listeners cppCreateListeners(long j, CommandQueue commandQueue);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppCreateStateMachineByName(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppDecodeAudio(long j, long j2, byte[] bArr);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppDecodeFont(long j, long j2, byte[] bArr);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppDecodeImage(long j, long j2, byte[] bArr);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppDefaultVMCreateBlankVMI(long j, long j2, long j3, long j4);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppDefaultVMCreateDefaultVMI(long j, long j2, long j3, long j4);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppDefaultVMCreateNamedVMI(long j, long j2, long j3, long j4, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDelete(long j);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteArtboard(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteAudio(long j, long j2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteFile(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteFont(long j, long j2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteImage(long j, long j2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteStateMachine(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDeleteViewModelInstance(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDrainSemanticsDiff(long j, long j2, byte b, byte b2, float f, float f2, float f3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDraw(long j, long j2, long j3, long j4, long j5, long j6, int i, int i2, byte b, byte b2, float f, int i3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppDrawToBuffer(long j, long j2, long j3, long j4, long j5, long j6, int i, int i2, byte b, byte b2, float f, int i3, byte[] bArr);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppEnableSemantics(long j, long j2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppFireSemanticAction(long j, long j2, int i, int i2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppFireTriggerProperty(long j, long j2, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppFocusNext(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppFocusPrevious(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetArtboardNames(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetArtboardVolume(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetBooleanProperty(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetColorProperty(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetDefaultViewModelInfo(long j, long j2, long j3, long j4);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetEnumProperty(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetEnums(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetFileAssets(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetListSize(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetNumberProperty(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetStateMachineNames(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetStringProperty(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetViewModelInstanceName(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetViewModelInstanceNames(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetViewModelInstanceViewModelName(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetViewModelNames(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppGetViewModelProperties(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppInsertToListAtIndex(long j, long j2, String str, int i, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppLoadFile(long j, long j2, byte[] bArr);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppNamedVMCreateBlankVMI(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppNamedVMCreateDefaultVMI(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppNamedVMCreateNamedVMI(long j, long j2, long j3, String str, String str2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppPointerDown(long j, long j2, byte b, byte b2, float f, float f2, float f3, int i, float f4, float f5);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppPointerExit(long j, long j2, byte b, byte b2, float f, float f2, float f3, int i, float f4, float f5);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppPointerMove(long j, long j2, byte b, byte b2, float f, float f2, float f3, int i, float f4, float f5);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppPointerUp(long j, long j2, byte b, byte b2, float f, float f2, float f3, int i, float f4, float f5);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppPollMessages(long j);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppReferenceListItemVMI(long j, long j2, long j3, String str, int i);

    @Override // app.rive.core.CommandQueueBridge
    public native long cppReferenceNestedVMI(long j, long j2, long j3, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRegisterAudio(long j, String str, long j2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRegisterFont(long j, String str, long j2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRegisterImage(long j, String str, long j2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRemoveFromList(long j, long j2, String str, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRemoveFromListAtIndex(long j, long j2, String str, int i);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRequestFocusState(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRequestHasFocusNodes(long j, long j2, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRequestSemanticFocus(long j, long j2, int i);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppResetArtboardSize(long j, long j2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppResizeArtboard(long j, long j2, int i, int i2, float f);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppRunOnCommandServer(long j, Function0 function0);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetArtboardProperty(long j, long j2, String str, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetArtboardVolume(long j, long j2, long j3, float f);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetBooleanProperty(long j, long j2, String str, boolean z);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetColorProperty(long j, long j2, String str, int i);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetDeferredEnabled(long j, boolean z);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetEnumProperty(long j, long j2, String str, String str2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetFontProperty(long j, long j2, String str, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetGlobalViewModelInstance(long j, long j2, long j3, String str, long j4);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetImageProperty(long j, long j2, String str, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetMainViewModelInstance(long j, long j2, long j3, long j4);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetNumberProperty(long j, long j2, String str, float f);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetStringProperty(long j, long j2, String str, String str2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetTracingEnabled(long j, boolean z);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSetViewModelInstanceProperty(long j, long j2, String str, long j3);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSubscribeToProperty(long j, long j2, String str, int i);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppSwapListItems(long j, long j2, String str, int i, int i2);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppUnregisterAudio(long j, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppUnregisterFont(long j, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppUnregisterImage(long j, String str);

    @Override // app.rive.core.CommandQueueBridge
    public native void cppUnsubscribeFromProperty(long j, long j2, String str, int i);

    @Override // app.rive.core.CommandQueueBridge
    public native boolean isCurrentThreadCommandServer(long j);
}
