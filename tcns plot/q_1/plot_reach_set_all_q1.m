%close all

clear all
%for i=0:7
%end

M =  dlmread('quadcopter1_reach_set_10.txt');
x_min = M(:, 2);
x_max = M(:, 3);
y_min= M(:, 6);
y_max = M(:, 7);
h1 = figure;
for i = 1: length(x_min)
    pos = [x_min(i), y_min(i),x_max(i) - x_min(i), y_max(i)- y_min(i)];
    rectangle('Position',pos,'FaceColor','b','Edgecolor','b','LineWidth',1.5);
end
hold on
xmin = min(x_min);
xmax = max(x_max);
ymin = min(y_min);
ymax = max(y_max);
pos = [xmin, ymin,xmax - xmin, ymax - ymin];
rectangle('Position',pos,'FaceColor','none','Edgecolor',[.61 .51 .74],'LineWidth',1.5);




%set(h1, 'Position',[280, 420, 400, 750]);
%MagInset(h1, -1, [x_min(300)-0.01 x_min(310) y_min(300)-0.1 y_min(310)], [300 360 550 720], {'NW','NE';'SE','SE'});

