// automatically generated by the FlatBuffers compiler, do not modify

import { StatusDoublyAssignedBody, StatusDoublyAssignedBodyT } from '../../solarxr-protocol/rpc/status-doubly-assigned-body.js';
import { StatusTrackerReset, StatusTrackerResetT } from '../../solarxr-protocol/rpc/status-tracker-reset.js';


export enum StatusData {
  NONE = 0,
  StatusTrackerReset = 1,
  StatusDoublyAssignedBody = 2
}

export function unionToStatusData(
  type: StatusData,
  accessor: (obj:StatusDoublyAssignedBody|StatusTrackerReset) => StatusDoublyAssignedBody|StatusTrackerReset|null
): StatusDoublyAssignedBody|StatusTrackerReset|null {
  switch(StatusData[type]) {
    case 'NONE': return null; 
    case 'StatusTrackerReset': return accessor(new StatusTrackerReset())! as StatusTrackerReset;
    case 'StatusDoublyAssignedBody': return accessor(new StatusDoublyAssignedBody())! as StatusDoublyAssignedBody;
    default: return null;
  }
}

export function unionListToStatusData(
  type: StatusData, 
  accessor: (index: number, obj:StatusDoublyAssignedBody|StatusTrackerReset) => StatusDoublyAssignedBody|StatusTrackerReset|null, 
  index: number
): StatusDoublyAssignedBody|StatusTrackerReset|null {
  switch(StatusData[type]) {
    case 'NONE': return null; 
    case 'StatusTrackerReset': return accessor(index, new StatusTrackerReset())! as StatusTrackerReset;
    case 'StatusDoublyAssignedBody': return accessor(index, new StatusDoublyAssignedBody())! as StatusDoublyAssignedBody;
    default: return null;
  }
}
